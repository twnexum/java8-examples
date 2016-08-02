package java8.lang;

import java.util.function.Consumer;

/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
public interface HashCode<T> extends PropertyAccess<T> {

	default int valueHashCode() {
        return propertyList()
        		.stream()
        		.map(property -> (Object) property.apply((T) this))
        		.collect(HashFunction::new, HashFunction::accept, HashFunction::combine)
        		.result;
    }
 
 
	static class HashFunction implements Consumer {
	
		private int result = 0;

		public void accept(Object value) {
			result = 31 * result + (value != null ? value.hashCode() : 0);
		}

		public void combine(HashFunction other) {
			result += other.result;
		}
	}
    
}
