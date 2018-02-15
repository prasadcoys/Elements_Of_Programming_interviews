package C_0.dynamic.programming;

import org.junit.Ignore;
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

    @Test
    public void
            testIfRodCuttingForPricesWhereNoCutYieldsBestPriceIsComputedCorrectly()
    {
        int[] prices = {1,2,3,4};
        assertEquals(1,RodCuttingCracker.getMaximumRevenue(1,prices));
        assertEquals(2,RodCuttingCracker.getMaximumRevenue(2,prices));
        assertEquals(3,RodCuttingCracker.getMaximumRevenue(3,prices));
        assertEquals(4,RodCuttingCracker.getMaximumRevenue(4,prices));
    }

    @Test
    public void
    testIfRodCuttingForPricesWhereOneCutYieldsBestPriceIsComputedCorrectly()
    {
        int[] prices = {1,3,3,4};
        assertEquals(1,RodCuttingCracker.getMaximumRevenue(1,prices));
        assertEquals(3,RodCuttingCracker.getMaximumRevenue(2,prices));
        assertEquals(4,RodCuttingCracker.getMaximumRevenue(3,prices));
    }

}
