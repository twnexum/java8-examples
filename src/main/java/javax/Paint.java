package javax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.lang.Equals;
import javax.lang.HashCode;
import javax.lang.ToString;

/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
interface Paint extends Equals<Paint>, ToString<Paint>, HashCode<Paint> {

	int red();
	int green();
	int blue();

	static Paint of(int red, int green, int blue) {
		
		return new Paint() {
			public int red() {
				return red;
			}

			public int green() {
				return green;
			}

			public int blue() {
				return blue;
			}

			@Override
			public boolean equals(Object o) {
				return valueEquals(o);
			}

			@Override
			public int hashCode() {
				return valueHashCode();
			}

			@Override
			public String toString() {
				return valueToString();
			}
		};
	}
 
    default List<Function<Paint,?>> propertyList() {
        return Arrays.asList(Paint::red, Paint::green, Paint::blue);
    }

}
