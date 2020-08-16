package dynamicprogramming.stockprofit;

public class BestTimeToBuyAndSellStock3 {
    public int maxProfit(int[] prices) {

        int maxProfit1 = 0;
        int maxProfit2 = 0;
        int localMax = 0;
        int sellingPriceIndex = prices.length-1;
        for (int i = prices.length-2; i >=0; i--) {
            localMax = Math.max(prices[sellingPriceIndex] - prices[i],
                    localMax);
            System.out.println(i+":"+localMax+":"+sellingPriceIndex);
            if (prices[i]>prices[i+1]){
                sellingPriceIndex = i;

                if ( localMax > maxProfit1){
                    maxProfit1 = localMax;
                } else if (localMax > maxProfit2){
                    maxProfit2 = localMax;
                }
                localMax = 0;
            }


        }
        if ( localMax > maxProfit1){
            maxProfit1 = localMax;
        } else if (localMax > maxProfit2){
            maxProfit2 = localMax;
        }

        System.out.println(maxProfit1+":"+maxProfit2);
        return maxProfit1 + maxProfit2;
    }
}
