package C_0;

import java.util.HashMap;
import java.util.Map;

public class ParityFinder
{
    static Map<Long, Integer> parityCache = new HashMap<>();

    public static boolean isOddParity(long binary)
    {

        int oneCounter = 0;

        while (binary != 0)
        {
            oneCounter += binary & 0b1;
            binary >>= 1;
        }


        return isNumberOdd(oneCounter);
    }

    public static boolean isOddParityBitOperation(long binary)
    {
        int oneCounter = getNumberOfOnes(binary);
        return isNumberOdd(oneCounter);
    }

    private static int getNumberOfOnes(long binary)
    {
        int oneCounter = 0;
        while (binary != 0)
        {
            binary &= binary - 1;
            oneCounter++;
        }
        parityCache.put(binary, oneCounter);
        return oneCounter;
    }

    public static boolean isOddParityBitOperationCachedVersion(long binary)
    {
        int numberOfOnes = 0;
        while (binary != 0)
        {
            long lastSixteenBits = binary & 0b1111111111111111;
            if (parityCache.get(lastSixteenBits) == null)
            {
                numberOfOnes += getNumberOfOnes(lastSixteenBits);
                binary >>= 16;
                continue;
            }
            numberOfOnes += parityCache.get(lastSixteenBits);
            binary >>= 16;
        }
        return isNumberOdd(numberOfOnes);
    }

    private static boolean isNumberOdd(int oneCounter)
    {
        return oneCounter % 2 == 1;
    }
}
