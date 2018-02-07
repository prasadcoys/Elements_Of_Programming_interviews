package C_0.dynamic.programming;

public class LongestCommonSubsequenceFinder
{
    //naive recursion
    public static int findLCS(int[] a, int[] b)
    {
        return findLCSNaiveRecursion(a,b,a.length,b.length);
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
