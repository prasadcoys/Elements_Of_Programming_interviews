package dynamicprogramming.longestincreasingsubsequence;

import org.junit.Assert;
import org.junit.Test;

public class MaxLengthOfPairChainTest {

    @Test
    public void testIfWeGet1ForBaseCase(){
        int[][] pairs = new int[][]{{1,2}};
        Assert.assertEquals(1,
                new MaxLengthOfPairChain().findLongestChain(pairs));
    }

    @Test
    public void testIfWeGet2WhenThereIsAPair(){
        int[][] pairs = new int[][]{{1,2},{3,4}};
        Assert.assertEquals(2,
                new MaxLengthOfPairChain().findLongestChain(pairs));
    }

    @Test
    public void testIFWeGet1WhenThereIsNoIncreasingPair(){
        int[][] pairs = new int[][]{{1,2},{2,4}};
        Assert.assertEquals(1,
                new MaxLengthOfPairChain().findLongestChain(pairs));
    }

    @Test
    public void testIFWeGet2WhenThereIsAnIncreasingPairNotContiguous(){
        int[][] pairs = new int[][]{{1,2},{2,3},{3,4}};
        Assert.assertEquals(2,
                new MaxLengthOfPairChain().findLongestChain(pairs));
    }

    @Test
    public void testIfWeGetTheCorrectValuesWhenIncreasingPairIsInTheMiddle(){
        int[][] pairs = new int[][]{{1,2},{3,4},{2,3}};
        Assert.assertEquals(2,
                new MaxLengthOfPairChain().findLongestChain(pairs));
    }

    @Test
    public void testIfWeCanGetPairsEvenIfTheyAreNotInOrder(){
        int[][]pairs = new int[][]{{3,4},{2,3},{1,2}};
        Assert.assertEquals(2,
                new MaxLengthOfPairChain().findLongestChain(pairs));
    }
}
