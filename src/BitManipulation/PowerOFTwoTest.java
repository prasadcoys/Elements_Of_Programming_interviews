package BitManipulation;

import org.junit.Assert;
import org.junit.Test;

public class PowerOFTwoTest {

    @Test
    public void testIfPowerOfTwo(){
        Assert.assertTrue(new PowerOfTwo().isPowerOfTwo(1));
        Assert.assertTrue(new PowerOfTwo().isPowerOfTwo(16));
        Assert.assertFalse(new PowerOfTwo().isPowerOfTwo(218));
    }
}
