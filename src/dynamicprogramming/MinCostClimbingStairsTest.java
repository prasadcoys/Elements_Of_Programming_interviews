package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class MinCostClimbingStairsTest {

    @Test
    public void testIfWeCanCalculateMinCostCorrectlyForThreeSteps(){
        int[] cost = new int[]{10,15,20};
        Assert.assertEquals(15,
                new MinCostClimbingStairs().minCostClimbingStairs(cost));
    }

    @Test
    public void testIfWeCanCalculateForTwoSteps(){
        int[] cost = new int[]{10,15};
        Assert.assertEquals(10,
                new MinCostClimbingStairs().minCostClimbingStairs(cost));
    }

    @Test
    public void testIfWeCanCalculateFormanyStep(){
        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Assert.assertEquals(6,
                new MinCostClimbingStairs().minCostClimbingStairs(cost));
    }

    @Test
    public void testIfWeCanCalculateForStepsWith0(){
        int[] cost = new int[]{0,2,2,1};
        Assert.assertEquals(2,
                new MinCostClimbingStairs().minCostClimbingStairs(cost));
    }
}
