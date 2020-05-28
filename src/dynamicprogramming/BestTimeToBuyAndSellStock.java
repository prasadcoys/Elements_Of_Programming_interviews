package dynamicprogramming;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int spi = prices.length - 1;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[ spi ] - prices[ i ] > maxProfit) {
                maxProfit = prices[ spi ] - prices[ i ];
            }
            if (prices[ i ] > prices[ spi ]) {
                spi = i;
            }
        }
        return maxProfit;
    }
}
