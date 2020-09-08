package BitManipulation;

import org.junit.Assert;
import org.junit.Test;

public class SetBitsPrimeNumberTest {
    @Test
    public void testIfNumberIsPrime(){
        Assert.assertTrue(new SetBitsPrimeNumber().isPrime(2));
        Assert.assertTrue(new SetBitsPrimeNumber().isPrime(3));
        Assert.assertFalse(new SetBitsPrimeNumber().isPrime(4));
        Assert.assertFalse(new SetBitsPrimeNumber().isPrime(1));


    }

    @Test
    public void testIfWeCanGetNumberOfPrimes(){
        Assert.assertEquals(4,
                new SetBitsPrimeNumber().countPrimeSetBits(6,10));
        Assert.assertEquals(5,
                new SetBitsPrimeNumber().countPrimeSetBits(10,15));
    }
}
