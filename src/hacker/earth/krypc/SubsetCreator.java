package hacker.earth.krypc;

public class SubsetCreator
{

    public static int[][] createSubSets(int[] inputArray, int level)
    {

        int combinations = calculateNCR(inputArray.length,level);
        int[][] resultArray = new int[combinations][];
        if(level == 1)
        {
            for(int i = 0;i<combinations;i++)
            {
                resultArray[i] = new int[] {inputArray[i]};
            }
        }
        else
        {
            
        }
        return resultArray;

    }

    public static int calculateNCR(int n, int r)
    {
        int ncr = 0;
        ncr = factorial (n)/(factorial(r)*(factorial(n-r)));
        return ncr;
    }

    private static int factorial(int r)
    {
        int fact = 1;
        for(int i = 1;i<=r;i++)
        {
            fact = fact* i;
        }

        return fact;
    }
}
