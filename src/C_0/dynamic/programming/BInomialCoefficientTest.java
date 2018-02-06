package C_0.dynamic.programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BInomialCoefficientTest
{
    @Test
    public void testIfBinomialCofficientFinderReturnsProperValue()
    {
        int n = 4;
        int r = 2;
        assertEquals(6,BinomialCoefficientFinder.findCoefficient(n,r),2);
    }
    @Test
    public void testForALargeNumber()
    {
        int n = 100;
        int r = 53;
        assertEquals(131282408400.0,
                BinomialCoefficientFinder.findCoefficient(40,21),1);
    }
}
