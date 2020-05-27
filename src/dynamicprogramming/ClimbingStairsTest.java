package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void testIfClimbingZeroStepsIsDoneInZero(){
        Assert.assertEquals(1,new ClimbingStairs().climbStairs(1));
    }

    @Test
    public void testIfClimbingOneStepCanBeDoneInOne(){
        Assert.assertEquals(1,new ClimbingStairs().climbStairs(1));
    }

    @Test
    public void testIfClimbing3StepsCanBeDoneInThreeWays(){
        Assert.assertEquals(3,new ClimbingStairs().climbStairs(3));
    }
}
