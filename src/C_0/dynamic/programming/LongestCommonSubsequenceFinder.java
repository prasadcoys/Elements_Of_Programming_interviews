package C_0.dynamic.programming;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequenceFinder
{

    static Map<String,Integer> memo = new HashMap<>();
    //naive recursion
    public static int findLCS(int[] a, int[] b)
    {
        return findLCSMemoisedRecursion(a,b,a.length,b.length);
    }

    private static int findLCSMemoisedRecursion(int[] a, int[] b, int
            alength, int blength)
    {
        String key = alength + "-" + blength;
        if(memo.containsKey(key))
        {
            return memo.get(key);
        }
        else
        {
            if(alength == 0 || blength ==0)
            {
                memo.put(alength+"-"+blength,0);
                return 0;
            }
            else if(a[alength-1] == b[blength-1])
            {
                int value = 1 + findLCSMemoisedRecursion(a, b, alength - 1, blength - 1);
                memo.put(alength+"-"+blength,value);
                return value;
            }
            else
            {
                int max = Math.max(findLCSMemoisedRecursion(a, b, alength - 1,
                        blength), findLCSMemoisedRecursion(a, b, alength,
                        blength - 1));
                memo.put(alength+"-"+blength,max);
                return max;
            }
                
        }
    }

    private static int findLCSNaiveRecursion(int[] a, int[] b, int alength, int blength)
    {
        if(alength==0 || blength ==0)
        {
            return 0;
        }
        if(a[alength-1] == b[blength-1])
        {
            return 1 + findLCSNaiveRecursion(a,b,alength-1,blength-1);
        }
        else
        {
            return Math.max(findLCSNaiveRecursion(a,b,alength,
                    blength-1),findLCSNaiveRecursion(a,b,alength-1,
                    blength));
        }
    }
}
