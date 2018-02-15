package C_0.dynamic.programming;

public class RodCuttingCracker
{
    public static int getMaximumRevenue(int length, int[] prices)
    {
        int i = 1;
        int currentMax = -10000;
        if(length==1)
        {
            return prices[0];
        }
        while(i<length)
        {
             currentMax = Math.max(currentMax,Math.max(prices[length-1],
                     getMaximumRevenue(i,
                     prices)+getMaximumRevenue(length-i,prices)));
             i++;
        }

        return currentMax;
    }
}
