package C_0;

import org.junit.Test;

import static org.junit.Assert.*;


public class ParityOfWordTest
{
    @Test
    public void testIfWordWithOddNoOfOnesShowsTrueParity()
    {
        long binary = 0b01011L;
        assertTrue(ParityFinder.isOddParityBitOperation(binary));
    }

    @Test
    public void testIfWordWithEvenNoOfOnesShowsFalseParity()
    {
        long binary = 0b01010L;
        assertFalse(ParityFinder.isOddParityBitOperation(binary));
    }

    @Test
    public void
    testIfWordWithEvenNoOfOnesWithLastDigitOneShowsFalseParity()
    {
        long binary = 0b0101L;
        assertFalse(ParityFinder.isOddParityBitOperation(binary));
    }

    @Test
    public void
    testIfWordWithOnlyOneONEShowsTrueParity()
    {
        long binary = 0b1L;
        assertTrue(ParityFinder.isOddParityBitOperation(binary));
    }

    @Test
    public void
    testIfWordWithOnlyOneZEROShowsFalseParity()
    {
        long binary = 0b0L;
        assertFalse(ParityFinder.isOddParityBitOperation(binary));
    }
}
