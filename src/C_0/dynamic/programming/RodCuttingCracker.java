package C_0.dynamic.programming;

import java.util.HashMap;
import java.util.Map;

public class RodCuttingCracker
{
    static Map<Integer, Integer> pricesMap = new HashMap<>();

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
        if(pricesMap.containsKey(length))
        {
            System.out.println("length already calcuated "+length);
            return pricesMap.get(length);
        }
        System.out.println("length not already present "+length);
        if (length == 1)
        {
            pricesMap.put(length,prices[length-1]);
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
        pricesMap.put(length,currentMax);
        return currentMax;
    }
}
