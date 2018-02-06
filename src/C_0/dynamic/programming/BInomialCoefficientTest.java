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
        assertEquals(6,BinomialCoefficientFinder.findCoefficient(n,r));
    }
}
