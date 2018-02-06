package C_0.dynamic.programming;

public class BinomialCoefficientFinder
{

    public static double findCoefficient(int n, int r)
    {
        double coefficient = 1.0f;
        int i = 1;
        while(i<=r)
        {
            coefficient = coefficient * (n-i+1)/i;
            i++;
        }
        return coefficient;
    }
}
