package dynamicprogramming.stockprofit;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int sellingPriceIndex = prices.length - 1;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[ sellingPriceIndex ] - prices[ i ] > maxProfit) {
                maxProfit = prices[ sellingPriceIndex ] - prices[ i ];
            }
            if (prices[ i ] > prices[ sellingPriceIndex ]) {
                sellingPriceIndex = i;
            }
        }
        return maxProfit;
    }
}
