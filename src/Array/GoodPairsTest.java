package Array;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsTest {
    @Test
    public void testIfCombinationsWork(){
        Assert.assertEquals(6, new GoodPairs().combinationTwo(4));
        Assert.assertEquals(1, new GoodPairs().combinationTwo(2));
    }

    @Test
    public void testIfNumberOfGoodPairsCanBeFound(){
        Assert.assertEquals(4,
                new GoodPairs().numIdenticalPairs(new int[]{1,2,3,1,1,3}));
        Assert.assertEquals(6,
                new GoodPairs().numIdenticalPairs(new int[]{1,1,1,1}));
        Assert.assertEquals(0,
                new GoodPairs().numIdenticalPairs(new int[]{1,2,3}));
    }

}
