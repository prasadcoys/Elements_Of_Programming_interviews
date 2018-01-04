package C_0;

public class ParityFinder
{
    public static boolean isOddParity(long binary)
    {

        int oneCounter = 0;

        while(binary!=0)
        {
            oneCounter += binary & 0b1;
            binary>>=1;
        }


        return isNumberOdd(oneCounter);
    }

    public static boolean isOddParityBitOperation(long binary)
    {
        int oneCounter = 0;
        while (binary!=0)
        {
            binary &= binary - 1;
            oneCounter ++;
        }
        return isNumberOdd(oneCounter);
    }

    private static boolean isNumberOdd(int oneCounter)
    {
        return oneCounter%2 ==1;
    }
}
