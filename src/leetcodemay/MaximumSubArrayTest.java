package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubArrayTest {

    @Test
    public void testIfMAximumSumSubarrayisfound(){
        Assert.assertEquals(6,
                new MaximumSubArray().maxSubArray(new int[]{-2,1,-3,4,
                        -1,2,1,-5,4}));
    }
}
