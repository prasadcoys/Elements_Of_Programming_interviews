package BitManipulation;

import org.junit.Assert;
import org.junit.Test;

public class HammingDistanceTest {
    @Test
    public  void testIfHammingDistanceIsCalculated(){
        Assert.assertEquals(2, new HammingDistance().hammingDistance(1,4));
        Assert.assertEquals(0, new HammingDistance().hammingDistance(1,1));
    }
}
