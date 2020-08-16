package Array;

import org.junit.Assert;
import org.junit.Test;

public class ShufflerTest {

    @Test
    public void testIfShufflerCase1Works(){
        int[] nums = new int[]{2,5,1,3,4,7};
        int n = 3;
        int[] expected = new int[]{2,3,5,4,1,7};
        Assert.assertArrayEquals(expected,new Shuffler().shuffle(nums,n));
    }

    @Test
    public void testIfShufflerCase2Works(){
        int[] nums = new int[]{1,2,3,4,4,3,2,1};
        int n = 4;
        int[] expected = new int[]{1,4,2,3,3,2,4,1};
        Assert.assertArrayEquals(expected,new Shuffler().shuffle(nums,n));
    }
    @Test
    public void testIfShufflerCase3Works(){
        int[] nums = new int[]{1,1,2,2};
        int n = 2;
        int[] expected = new int[]{1,2,1,2};
        Assert.assertArrayEquals(expected,new Shuffler().shuffle(nums,n));
    }

}
