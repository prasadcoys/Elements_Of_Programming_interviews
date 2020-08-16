package dynamicprogramming.stockprofit;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStock3Test {

    @Test
    public void testIfWeGetZeroProfitWhenWeHaveOnlyOneDay() {
        int[] prices = new int[]{1};
        Assert.assertEquals(0,
                new BestTimeToBuyAndSellStock3().maxProfit(prices));
    }

    @Test
    public void testIfWeGetZeroProfitWhenWeHaveABearMarket() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        Assert.assertEquals(0,
                new BestTimeToBuyAndSellStock3().maxProfit(prices));
    }

    @Test
    public void testIfWeGetMaxProfitWhenWeHaveABullMarket() {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(4,
                new BestTimeToBuyAndSellStock3().maxProfit(prices));
    }

    @Test
    public void testIfWeGetBestProfitWhenWeHaveAtmostTwoTransactions(){
        int[] prices = new int[]{3,3,5,0,0,3,1,4};
        Assert.assertEquals(6,
                new BestTimeToBuyAndSellStock3().maxProfit(prices));
    }

    @Test
    public void testIfWeGetProperProfitWhenWeHaveZeroAtEnd(){
        int[] prices = new int[]{1,2,4,2,5,7,2,4,9,0};
        Assert.assertEquals(13,
                new BestTimeToBuyAndSellStock3().maxProfit(prices));
    }
}
