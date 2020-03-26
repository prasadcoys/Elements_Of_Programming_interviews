package C_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exponentiation
{
    public static double pow(double number, int exponent)
    {
        if(exponent == 0)
            return 1;
        double currentPower = number;
        double[] memo = new double[exponent+1];
        memo[1] = number;
        if(exponent>1)
        {
            int currentExponent = 2;

            while(exponent>=1)
            {
                if(currentExponent<=exponent)
                {
                    currentPower*=currentPower;
                    memo[currentExponent]=currentPower;
                    exponent-=currentExponent;
                    currentExponent *= currentExponent;

                }
                else
                {
                    if(memo[exponent]!=0)
                    {
                        currentPower *= memo[exponent];
                        return currentPower;
                    }
                    else
                    {
                        for(int i = memo.length-1;i>=0&&exponent>0;i--)
                        {
                            if(memo[i]>0)
                            {
                                if (i == exponent)
                                {
                                    currentPower *= memo[ exponent ];
                                    return currentPower;
                                } else if (i < exponent)
                                {
                                    currentPower *= memo[ i ];
                                    exponent -= i;
                                    i = memo.length-1;
                                }
                            }
                        }
                    }

                }
            }
        }
        else if(exponent ==0)
        {
            return 1;
        }
        else if (exponent == 1)
        {
            return number;
        }

        return currentPower;
    }
}
