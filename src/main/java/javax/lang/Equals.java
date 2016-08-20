package javax.lang;

import java.util.Objects;

/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
public interface Equals<T> extends PropertyAccess<T> {

	default boolean valueEquals(Object obj) {
		
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		final T otherValue = (T) obj;

		return propertyList()
				.stream()
				.allMatch(property -> Objects.equals(property.apply((T) this), property.apply(otherValue)));
	}

}
