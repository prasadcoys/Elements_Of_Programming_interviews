package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class NumArrayTest {

    @Test
    public void testIfSum02IsCalculated(){
        NumArray numArray = new NumArray(new int[]{-2,0,3,-5,2,-1});
        Assert.assertEquals(1,numArray.sumRange(0,2));
    }

    @Test
    public void testIfSum25Works(){
        NumArray numArray = new NumArray(new int[]{-2,0,3,-5,2,-1});
        Assert.assertEquals(-1,numArray.sumRange(2,5));
    }

    @Test
    public void testIfSum05Works(){
        NumArray numArray = new NumArray(new int[]{-2,0,3,-5,2,-1});
        Assert.assertEquals(-3,numArray.sumRange(0,5));
    }

}
