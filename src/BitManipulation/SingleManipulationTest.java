package BitManipulation;

import org.junit.Assert;
import org.junit.Test;

public class SingleManipulationTest {
    @Test
    public void testIfSingleNumberCanBeFoundout(){
        Assert.assertEquals(1,
                new SingleManipulation().singleNumber(new int[]{2,2,1}));
        Assert.assertEquals(1,
                new SingleManipulation().singleNumber(new int[]{2,1,2}));
        Assert.assertEquals(1,
                new SingleManipulation().singleNumber(new int[]{1,2,2}));

    }

    @Test
    public void testIfBiggerArrayCanBeProcessed(){
        Assert.assertEquals(1,
                new SingleManipulation().singleNumber(new int[]{2,2,1}));
    }
}
