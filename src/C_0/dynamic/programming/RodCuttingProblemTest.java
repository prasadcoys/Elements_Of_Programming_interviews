package C_0.dynamic.programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RodCuttingProblemTest
{
    @Test
    public void testIfRodCuttingProblemCrackerWorksCorrectly()
    {
        int[] prices = {1,5,8,9,10,17,17,20,24,30};
        assertEquals(1,RodCuttingCracker.getMaximumRevenue(1,prices));
        assertEquals(10,RodCuttingCracker.getMaximumRevenue(4,prices));
        assertEquals(13,RodCuttingCracker.getMaximumRevenue(5,prices));
        assertEquals(22,RodCuttingCracker.getMaximumRevenue(8,prices));
        assertEquals(30,RodCuttingCracker.getMaximumRevenue(10,prices));
    }
}
