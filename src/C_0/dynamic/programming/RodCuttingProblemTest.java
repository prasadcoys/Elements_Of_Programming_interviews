package C_0.dynamic.programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RodCuttingProblemTest
{
    @Test
    public void
    testIfRodCuttingProblemCrackerWorksCorrectlyByNaiveRecursion()
    {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        assertEquals(1, RodCuttingCracker.getMaximumRevenueNaiveRecursion(1, prices));
        assertEquals(10, RodCuttingCracker.getMaximumRevenueNaiveRecursion(4, prices));
        assertEquals(13, RodCuttingCracker.getMaximumRevenueNaiveRecursion(5, prices));
        assertEquals(22, RodCuttingCracker.getMaximumRevenueNaiveRecursion(8, prices));
        assertEquals(30, RodCuttingCracker.getMaximumRevenueNaiveRecursion(10, prices));
    }

    @Test
    public void
    testIfRodCuttingForPricesWhereNoCutYieldsBestPriceIsComputedCorrectlyByNaiveRecursion()
    {
        int[] prices = {1, 2, 3, 4};
        assertEquals(1, RodCuttingCracker.getMaximumRevenueNaiveRecursion(1, prices));
        assertEquals(2, RodCuttingCracker.getMaximumRevenueNaiveRecursion(2, prices));
        assertEquals(3, RodCuttingCracker.getMaximumRevenueNaiveRecursion(3, prices));
        assertEquals(4, RodCuttingCracker.getMaximumRevenueNaiveRecursion(4, prices));
    }

    @Test
    public void
    testIfRodCuttingForPricesWhereOneCutYieldsBestPriceIsComputedCorrectlyByNaiveRecursion()
    {
        int[] prices = {1, 3, 3, 4};
        assertEquals(1, RodCuttingCracker.getMaximumRevenueNaiveRecursion(1, prices));
        assertEquals(3, RodCuttingCracker.getMaximumRevenueNaiveRecursion(2, prices));
        assertEquals(4, RodCuttingCracker.getMaximumRevenueNaiveRecursion(3, prices));
    }
    @Test
    public void
    testIfRodCuttingProblemCrackerWorksCorrectlyByMemoizedRecursion()
    {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        assertEquals(1, RodCuttingCracker
                .getMaximumRevenueMemoizedRecursion(1, prices));
        assertEquals(10, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(4, prices));
        assertEquals(13, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(5, prices));
        assertEquals(22, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(8, prices));
        assertEquals(30, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(10, prices));
    }

    @Test
    public void
    testIfRodCuttingForPricesWhereNoCutYieldsBestPriceIsComputedCorrectlyByMemoizedRecursion()
    {
        int[] prices = {1, 2, 3, 4};
        assertEquals(1, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(1, prices));
        assertEquals(2, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(2, prices));
        assertEquals(3, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(3, prices));
        assertEquals(4, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(4, prices));
    }

    @Test
    public void
    testIfRodCuttingForPricesWhereOneCutYieldsBestPriceIsComputedCorrectlyByMemoizedRecursion()
    {
        int[] prices = {1, 3, 3, 4};
        assertEquals(1, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(1, prices));
        assertEquals(3, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(2, prices));
        assertEquals(4, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(3, prices));
    }

}
