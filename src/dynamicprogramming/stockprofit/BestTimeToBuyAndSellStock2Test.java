package dynamicprogramming.stockprofit;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStock2Test {

    @Test
    public void testIfWeGetZeroProfitIfThereIsOnlyOneDay(){
        int[] prices = new int[]{1};
        Assert.assertEquals(0,
                new BestTimeToBuyAndSellStock2().maxProfit(prices));
    }

    @Test
    public void testIfWeGetZeroWhenThereIsAMarketFallForTwoDays(){
        int[] prices = new int[]{7,1};
        Assert.assertEquals(0,
                new BestTimeToBuyAndSellStock2().maxProfit(prices));
    }

    @Test
    public void testIfWeGetMaxProfitWhenThereIsABullForTwoDays(){
        int[] prices = new int[]{1,7};
        Assert.assertEquals(6,
                new BestTimeToBuyAndSellStock2().maxProfit(prices));
    }
    @Test
    public void testIfWeGetMaxProfitWhenThereIsABullForMultipleDays(){
        int[] prices = new int[]{1,2,3,4,5};
        Assert.assertEquals(4,
                new BestTimeToBuyAndSellStock2().maxProfit(prices));
    }

    @Test
    public void testIfWeGetZeroProfitWhenThereIsABearForMultipleDays(){
        int[] prices = new int[]{5,4,3,2,1};
        Assert.assertEquals(0,
                new BestTimeToBuyAndSellStock2().maxProfit(prices));
    }

    @Test
    public void testIfWeGetPrfitWhenWeHaveBullMarketForFewDaysFollowedByBear(){
        int[] prices = new int[]{1,2,6,3,1};
        Assert.assertEquals(5,
                new BestTimeToBuyAndSellStock2().maxProfit(prices));
    }

    @Test
    public void testIfWeHaveTwoProfitsinDifferentPeriods(){
        int[] prices = new int[]{7,1,5,3,6,4};
        Assert.assertEquals(7,
                new BestTimeToBuyAndSellStock2().maxProfit(prices));
    }
}
