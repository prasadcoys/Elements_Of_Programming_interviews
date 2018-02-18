package C_0.dynamic.programming;

import java.util.HashMap;
import java.util.Map;

public class RodCuttingCracker
{
    static Map<Integer, Integer> pricesMap = new HashMap<>();

    public static void init()
    {
        pricesMap = new HashMap<>();
    }

    public static int getMaximumRevenueNaiveRecursion(int length, int[] prices)
    {
        int i = 1;
        int currentMax = -10000;
        if (length == 1)
        {
            return prices[ 0 ];
        }
        while (i < length)
        {
            currentMax = Math.max(currentMax, Math.max(prices[ length - 1 ],
                    getMaximumRevenueNaiveRecursion(i,
                            prices) + getMaximumRevenueNaiveRecursion(length - i, prices)));
            i++;
        }

        return currentMax;
    }

    public static int getMaximumRevenueMemoizedRecursion(int length, int[] prices)
    {
        int i = 1;
        int currentMax = -10000;
        if (pricesMap.containsKey(length))
        {
            return pricesMap.get(length);
        }
        if (length == 1)
        {
            pricesMap.put(length, prices[ length - 1 ]);
            return prices[ 0 ];
        }
        while (i < length)
        {
            currentMax = Math.max(currentMax, Math.max(prices[ length - 1 ],
                    getMaximumRevenueMemoizedRecursion(i,
                            prices) + getMaximumRevenueMemoizedRecursion
                            (length - i, prices)));
            i++;
        }
        pricesMap.put(length, currentMax);
        return currentMax;
    }

    public static int getMaximumRevenueBottomUp(int length, int[] prices)
    {
        int[] maximumRevenues = new int[ prices.length ];
        int i = 0;
        while (i < length)
        {
            if(i == 0)
            {
                maximumRevenues[0] = prices[0];
                i++;
            }
            else
            {
                maximumRevenues[i] = Math.max(prices[i],getMaxRevenue(i,
                        prices,maximumRevenues));
                i++;
            }
        }
        return maximumRevenues[length-1];
    }

    private static int getMaxRevenue(int i, int[] prices, int[] maximumRevenues)
    {
        int currentMax = prices[i];
        int j = 1;
        while(i>=j)
        {
            currentMax = Math.max(currentMax,
                    (maximumRevenues[i-j]+
                            maximumRevenues[j]));
            j++;
        }
        return currentMax;
    }
}
