package C_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExponentiationTest
{

    @Test
    public void testIfExponentiationOfIntegerInDoubleFormatWorks()
    {
        double x = 2;
        int y = 2;
        assertEquals(4,Exponentiation.pow(x,y));
    }

    @Test
    public void testIfExponentiationOfDoubleFormatWorks()
    {
        double x = 2.5;
        int y = 2;
        assertEquals(6.25,Exponentiation.pow(x,y));
    }

    @Test
    public void testIfExponentiationOfNegativeNumberWorks()
    {
        double x = -2.5;
        int y = 3;
        assertEquals(-15.625,Exponentiation.pow(x,y));
    }
}
