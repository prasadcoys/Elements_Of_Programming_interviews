package C_0;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


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

    @Test
    public void testIfCachedParityBitFinderWorksFor32Bit()
    {
        long binary = 0b01100110011001100110011001100110;
        assertFalse(ParityFinder.isOddParityBitOperationCachedVersion(binary));
    }

    @Test
    public void testIfCachedParityBitFinderWorksFor32BitForTrueparity()
    {
        long binary = 0b01100110011001100110011001100111;
        assertTrue(ParityFinder.isOddParityBitOperationCachedVersion
                (binary));
    }

    @Test
    public void testIfCachedParityBitFinderWorksFor4BitForTrueparity()
    {
        long binary = 0b0111;
        assertTrue(ParityFinder.isOddParityBitOperationCachedVersion
                (binary));
    }

    @Test
    public void testIfCachedParityBitFinderWorksFor1BitForTrueparity()
    {
        long binary = 0b1;
        assertTrue(ParityFinder.isOddParityBitOperationCachedVersion
                (binary));
    }

    @Test
    public void testIfCachedParityBitFinderWorksFor1BitForFalseparity()
    {
        long binary = 0b0;
        assertFalse(ParityFinder.isOddParityBitOperationCachedVersion
                (binary));
    }

    @Test
    public void testIfXORParityBitFinderWorksFor32BitForTrueparity()
    {
        long binary = 0b01100110011001100110011001100111;
        assertTrue(ParityFinder.isOddParityXORVersion
                (binary));
    }

    @Test
    public void testIfXORParityBitFinderWorksFor4BitForTrueparity()
    {
        long binary = 0b0111;
        assertTrue(ParityFinder.isOddParityXORVersion
                (binary));
    }

    @Test
    public void testIfXORParityBitFinderWorksFor1BitForTrueparity()
    {
        long binary = 0b1;
        assertTrue(ParityFinder.isOddParityXORVersion
                (binary));
    }

    @Test
    public void testIfXORParityBitFinderWorksFor1BitForFalseparity()
    {
        long binary = 0b0;
        assertFalse(ParityFinder.isOddParityXORVersion
                (binary));
    }


}
