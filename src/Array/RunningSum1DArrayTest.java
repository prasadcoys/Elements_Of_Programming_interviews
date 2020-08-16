package Array;

import org.junit.Assert;
import org.junit.Test;

public class RunningSum1DArrayTest {
    @Test
    public void testIFRunningSumForCase1Works(){

        Assert.assertArrayEquals(new int[]{1,2,3,4,5},
                new RunningSum1DArray().runningSum(new int[]{1,1,1,1,1}));
    }
    @Test
    public void testIFRunningSumForCase2Works(){

        Assert.assertArrayEquals(new int[]{1,3,6,10},
                new RunningSum1DArray().runningSum(new int[]{1,2,3,4}));
    }
    @Test
    public void testIFRunningSumForCase3Works(){

        Assert.assertArrayEquals(new int[]{3,4,6,16,17},
                new RunningSum1DArray().runningSum(new int[]{3,1,2,10,1}));
    }


}
