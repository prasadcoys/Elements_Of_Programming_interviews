package dynamicprogramming.stockprofit;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void testIfMaxPriceIsCalculatedCorrectlyWhenNoProfitCanBeMade() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        Assert.assertEquals(0,
                new BestTimeToBuyAndSellStock().maxProfit(prices));
    }

    @Test
    public void testIfMaxProfitIsCalculatedWhenProfitCanBeMade(){
        int[] prices = new int[]{7,1,5,3,6,4};
        Assert.assertEquals(5,
                new BestTimeToBuyAndSellStock().maxProfit(prices));
    }
    @Test
    public void testIfMaxProfitIsCalculatedWhenProfitCanBeMadeAtEnd(){
        int[] prices = new int[]{7,6,5,3,1,13};
        Assert.assertEquals(12,
                new BestTimeToBuyAndSellStock().maxProfit(prices));
    }
    @Test
    public void testIfMaxProfitIsCalculatedWhenProfitCanBeMadeAtBeginning(){
        int[] prices = new int[]{1,13,5,3,6,4};
        Assert.assertEquals(12,
                new BestTimeToBuyAndSellStock().maxProfit(prices));
    }


}
