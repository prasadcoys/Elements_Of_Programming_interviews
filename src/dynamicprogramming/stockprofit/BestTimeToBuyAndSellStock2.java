package dynamicprogramming.stockprofit;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int localMax = 0;
        int sellingPriceIndex = prices.length-1;
        for (int i = prices.length-2; i >=0; i--) {
            localMax = Math.max(prices[sellingPriceIndex] - prices[i],
                    localMax);
            if (prices[i]>prices[i+1]){
                sellingPriceIndex = i;
                maxProfit += localMax;
                localMax = 0;
            }

        }
        maxProfit+= localMax;
        return maxProfit;
    }

}
