package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class NaiveRecursionFibonacci
{
    static Map<Integer,Long> memo = new HashMap<>();

    public static void main(String[] args)
    {
        long fibNumber = calculateBottomUpFibonacci(100);
        System.out.println(fibNumber);
    }

    private static long calculateBottomUpFibonacci(int num)
    {
        long[] fibonacci = new long[num];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for(int i = 2;i<num;i++)
        {
            fibonacci[ i ] = fibonacci[ i - 1 ] + fibonacci[ i - 2 ];
        }
        return fibonacci[num-1];
    }

    private static long calculateMemoizedFibonacci(int num)
    {
        if(memo.get(num)!=null)
        {
            return memo.get(num);
        }
        if(num<=2)
        {
            return 1;
        }
        else
        {
            long l = calculateMemoizedFibonacci(num - 1)
                    + calculateMemoizedFibonacci(num - 2);
            memo.put(num,l);
            return l;
        }
    }

    private static long calculateNaiveFibonacci(int number)
    {
        if(number<=2)
        {
            return 1;
        }
        else
        {
            return calculateNaiveFibonacci(number-1)
                    +calculateNaiveFibonacci(number-2);
        }

    }


}
