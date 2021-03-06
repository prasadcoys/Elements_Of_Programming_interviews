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
        RodCuttingCracker.init();
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
        RodCuttingCracker.init();
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
        RodCuttingCracker.init();
        assertEquals(1, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(1, prices));
        assertEquals(3, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(2, prices));
        assertEquals(4, RodCuttingCracker.getMaximumRevenueMemoizedRecursion(3, prices));
    }

    @Test
    public void testAVeryLargeInputSize()
    {
        int[] prices = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
                20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
                38,39,40};
        RodCuttingCracker.init();
        assertEquals(40,RodCuttingCracker
                .getMaximumRevenueMemoizedRecursion(40,prices));
    }

    @Test
    public void
    testIfRodCuttingProblemCrackerWorksCorrectlyByBottomUpLogic()
    {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        assertEquals(1, RodCuttingCracker
                .getMaximumRevenueMemoizedRecursion(1, prices));
        assertEquals(10, RodCuttingCracker.getMaximumRevenueBottomUp(4,
                prices));
        assertEquals(13, RodCuttingCracker.getMaximumRevenueBottomUp(5, prices));
        assertEquals(22, RodCuttingCracker.getMaximumRevenueBottomUp(8, prices));
        assertEquals(30, RodCuttingCracker.getMaximumRevenueBottomUp(10, prices));
    }

    @Test
    public void
    testIfRodCuttingForPricesWhereNoCutYieldsBestPriceIsComputedCorrectlyByBottomUpLogic()
    {
        int[] prices = {1, 2, 3, 4};
        assertEquals(1, RodCuttingCracker.getMaximumRevenueBottomUp(1, prices));
        assertEquals(2, RodCuttingCracker.getMaximumRevenueBottomUp(2, prices));
        assertEquals(3, RodCuttingCracker.getMaximumRevenueBottomUp(3, prices));
        assertEquals(4, RodCuttingCracker.getMaximumRevenueBottomUp(4, prices));
    }

    @Test
    public void
    testIfRodCuttingForPricesWhereOneCutYieldsBestPriceIsComputedCorrectlyByBottomUpLogic()
    {
        int[] prices = {1, 3, 3, 4};
        assertEquals(1, RodCuttingCracker.getMaximumRevenueBottomUp(1, prices));
        assertEquals(3, RodCuttingCracker.getMaximumRevenueBottomUp(2, prices));
        assertEquals(4, RodCuttingCracker.getMaximumRevenueBottomUp(3, prices));
    }

    @Test
    public void testAVeryLargeInputSizeByBottomUpLogic()
    {
        int[] prices = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
                20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
                38,39,40};
        assertEquals(40,RodCuttingCracker
                .getMaximumRevenueBottomUp(40,prices));
    }
}
