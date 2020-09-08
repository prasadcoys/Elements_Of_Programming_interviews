package Array;

import org.junit.Assert;
import org.junit.Test;

public class HowManyGreaterThanMeTest {
    @Test
    public void testIfCaseOneWorks(){
        Assert.assertArrayEquals(new int[]{4,0,1,1,3},
                new HowManyGreaterThanMe().smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
    }

}
