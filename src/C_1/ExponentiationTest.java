package C_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExponentiationTest
{

    @Test
    public void testIfExponentIsZeroWeGetOne()
    {
        double number = 3.14123;
        int exponent = 0;
        assertEquals(1.0,Exponentiation.pow(number,exponent),3);
    }

    @Test
    public void testIfExponentIsOneWeGetSameNumber()
    {
        double number = 3.14123;
        int exponent = 1;
        assertEquals(3.14123,Exponentiation.pow(number,exponent),3);
    }
    @Test
    public void testIfSquaringWorksCorrectly()
    {
        double number = 2.5;
        int exponent = 2;
        assertEquals(6.25,Exponentiation.pow(number,exponent),3);
    }

    @Test
    public void testIfCubingWorksCorrectly()
    {
        double number = 2.5;
        int exponent = 3;
        assertEquals(Math.pow(number,exponent),Exponentiation.pow(number,
                exponent),3);
    }

    @Test
    public void testIfPower16WorksCorrectly()
    {
        double number = 2.5;
        int exponent = 16;
        assertEquals(Math.pow(number,exponent),Exponentiation.pow(number,
                exponent),3);
        System.out.println(Math.pow(2.5,14));
    }

    @Test
    public void testIfPower4Works()
    {
        double number = 2.5;
        int exponent = 4;
        assertEquals(Math.pow(number,exponent),Exponentiation.pow
                (number,exponent),3);
    }



}
