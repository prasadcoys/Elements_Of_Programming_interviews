package BitManipulation;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {
    @Test
    public void testIfMissingNumberIsFoundIfItsNotZero(){
        Assert.assertEquals(2,
                new MissingNumber().missingNumber(new int[] {3,0,1}));
        Assert.assertEquals(8,
                new MissingNumber().missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    @Test
    public void testIfMissingNumberIsFoundIfItsZero(){
        Assert.assertEquals(0,
                new MissingNumber().missingNumber(new int[] {3,2,1}));
        Assert.assertEquals(0,
                new MissingNumber().missingNumber(new int[] {9,6,4,2,3,5
                        ,7,8,1}));
    }
}
