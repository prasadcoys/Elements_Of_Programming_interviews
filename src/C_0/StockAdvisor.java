package C_0;

public class StockAdvisor
{

    public static StockAdvice getAdvice(int[] prices)
    {
        int i = 0, j = prices.length - 1;
        int currentCostPriceIndex = i;
        int currentSellingPriceIndex = j;
        while (true)
        {
            if ((i >= prices.length && j < 0))
            {
                break;
            } else
            {
                if ((prices[ i ] <= prices[ currentCostPriceIndex ]) &&
                        (i <= currentSellingPriceIndex))
                {
                    currentCostPriceIndex = i;
                }
                if ((prices[ j ] >= prices[ currentSellingPriceIndex ]) &&
                        (j >= currentCostPriceIndex))
                {
                    currentSellingPriceIndex = j;
                }

                if (i < prices.length)
                {
                    i++;
                }
                if (j >= 0)
                {
                    j--;
                }
            }
        }

        return new StockAdvice(prices[currentCostPriceIndex], prices[currentSellingPriceIndex]);
    }
}
