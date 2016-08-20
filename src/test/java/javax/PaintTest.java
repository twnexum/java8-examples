package javax;

import javax.Paint;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
public class PaintTest {
	
	@Test
	public void testCreate() {
		
	    Paint red = Paint.of(100,0,0);
	    Paint green = Paint.of(0,100,0);
	    
	    Assert.assertEquals(100, red.red());
	    Assert.assertEquals(100, green.green());
	}

}
