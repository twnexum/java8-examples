package javax.lang;

import java.util.stream.Collectors;

/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
public interface ToString<T> extends PropertyAccess<T> {

	default String valueToString() {
		return "{" 
				+ propertyList()
					.stream()
					.map(property -> (Object) property.apply((T) this))
					.map(Object::toString)
					.collect(Collectors.joining(", ")) 
				+ "}";
	}

}
