package javax.lang;

import java.util.List;
import java.util.function.Function;

/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
interface PropertyAccess<T> {
	
	List<Function<T,?>> propertyList();

}
