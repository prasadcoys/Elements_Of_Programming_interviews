package BitManipulation;

import org.junit.Assert;
import org.junit.Test;

public class XOROperationTest {
    @Test
    public void testIfBitwiseXORWorks(){
        Assert.assertEquals(8, new XOROperation().xorOperation(5,0));
        Assert.assertEquals(8, new XOROperation().xorOperation(4,3));
        Assert.assertEquals(7, new XOROperation().xorOperation(1,7));
        Assert.assertEquals(2, new XOROperation().xorOperation(10,5));
    }
}
