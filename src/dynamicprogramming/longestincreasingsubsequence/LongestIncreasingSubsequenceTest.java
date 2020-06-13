package dynamicprogramming.longestincreasingsubsequence;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void testIfASequenceWithOnlyOneElementReturns1(){
        Assert.assertEquals(1,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{101}));
    }

    @Test
    public void testIfASequenceWithNoElementsReturns0(){
        Assert.assertEquals(0,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{}));
    }

    @Test
    public void testIfASubsequenceWith2ElementsReturns2IfItisIncreasing(){
        Assert.assertEquals(2,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{1,2}));
    }

    @Test
    public void testIfASubsequenceWith2ElementsReturns1IfItisNotIncreasing(){
        Assert.assertEquals(1,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{2,1}));
    }

    @Test
    public void testIfASubsequenceWith3ElementsReturnsCorrectValueIfTheyAreIncreasing(){
        Assert.assertEquals(3,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{1,2,3}));
    }
    @Test
    public void testIfASubsequenceWith3ElementsReturnsCorrectValueIfTheyAreDecreasing(){
        Assert.assertEquals(1,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{3,2,1}));
    }
    @Test
    public void testIfASubsequenceWith3ElementsReturnsCorrectValueIfTheyAreIncreasingWithABiggerElementInMiddle(){
        Assert.assertEquals(2,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{1,4,3}));
    }
    @Test
    public void testIfASubsequenceWith4Elements3_4_5_2Returns2IfTheyAreIncreasing(){
        Assert.assertEquals(3,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{3,4,5,2}));
    }
    @Test
    public void testIfASubsequence10_9_2_5_3_7_101_18Returns4(){
        Assert.assertEquals(4,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    @Test
    public void testIfWeGetCorrectValueWhenWeHaveEqualElements(){
        Assert.assertEquals(3,
                new LongestIncreasingSubsequence().lengthOfLIS(new int[]{4,10,4,3,8,9}));
    }

}
