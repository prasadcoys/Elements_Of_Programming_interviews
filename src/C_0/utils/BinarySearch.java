package C_0.utils;

public class BinarySearch
{
    public static int find(int key, int[] sortedArray)
    {
        int leftMargin = 0, rightMargin = sortedArray.length - 1;

        while (leftMargin <= rightMargin)
        {
            if (leftMargin == rightMargin)
            {
                if (sortedArray[ leftMargin ] == key)
                {
                    return leftMargin;
                } else
                {
                    return -1;
                }

            } else
            {
                int midPoint = calculateMidpoint(leftMargin, rightMargin);
                if (sortedArray[ midPoint ] == key)
                {
                    return midPoint;
                } else if (sortedArray[ midPoint ] > key)
                {
                    rightMargin = midPoint - 1;
                } else
                {
                    leftMargin = midPoint + 1;
                }
            }
        }

        return 0;
    }

    private static int calculateMidpoint(int leftMargin, int rightMargin)
    {
        return (leftMargin + rightMargin) / 2;
    }

    public static int findFirstOccurrance(int key,int[] sortedArray)
    {
        int leftMargin = 0, rightMargin = sortedArray.length-1;
        int currentFirstOccurrance = -1;
        while(leftMargin<=rightMargin)
        {
            if (leftMargin == rightMargin)
            {
                if (sortedArray[ leftMargin ] == key)
                {
                    return leftMargin;
                } else
                {
                    return currentFirstOccurrance;
                }
            }
            else
            {
                int midPoint = calculateMidpoint(leftMargin,rightMargin);
                if(sortedArray[midPoint] == key)
                {
                    currentFirstOccurrance = midPoint;
                    rightMargin = midPoint-1;
                }
                else if(sortedArray[midPoint] < key)
                {
                    leftMargin = midPoint +1;
                }
                else
                {
                    rightMargin = midPoint-1;
                }

            }
        }

        return 0;
    }
}
