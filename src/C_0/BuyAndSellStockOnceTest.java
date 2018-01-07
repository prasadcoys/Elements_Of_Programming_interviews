package C_0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuyAndSellStockOnceTest
{
    @Test
    public void testIfValidBuyAndSellPointsAreIdentified()
    {
        int[] prices = { 310,315,275,295,260,270,290,230,255,250};
        StockAdvice advice = StockAdvisor.getAdvice(prices);
        assertEquals(260,advice.getBuyPrice());
        assertEquals(290,advice.getSellPrice());
    }

    @Test
    public void
    testIfValidBuyAndSellPointsAreIdentifiedIfBothPricesAreInFirsthalf()
    {
        int[] prices = { 200,315,275,295,260,270,290,230,255,250};
        StockAdvice advice = StockAdvisor.getAdvice(prices);
        assertEquals(200,advice.getBuyPrice());
        assertEquals(315,advice.getSellPrice());
    }
    @Test
    public void
    testIfValidBuyAndSellPointsAreIdentifiedIfBothPricesAreInSecondHalf()
    {
        int[] prices = { 310,315,275,295,260,270,290,230,300,250};
        StockAdvice advice = StockAdvisor.getAdvice(prices);
        assertEquals(230,advice.getBuyPrice());
        assertEquals(300,advice.getSellPrice());
    }

}
