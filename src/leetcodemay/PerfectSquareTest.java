package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class PerfectSquareTest {

    @Test
    public void testIf1IsAPerfectSquare(){
        Assert.assertTrue(new PerfectSquare().isPerfectSquare(1));
    }

    @Test
    public void testIf0IsAPerfectSquare(){
        Assert.assertTrue(new PerfectSquare().isPerfectSquare(0));
    }

    @Test
    public void testIf16IsAperfectSquare(){
        Assert.assertTrue(new PerfectSquare().isPerfectSquare(16));
    }

    @Test
    public void testIf14IsNotAPerfectSquare(){
        Assert.assertFalse(new PerfectSquare().isPerfectSquare(14));
    }

    @Test
    public void testIfMinusOneIsNotAPerfectSquare(){
        Assert.assertFalse(new PerfectSquare().isPerfectSquare(-1));
    }

    @Test
    public void testIf2147483647IsNotAPerfectSquare(){
        Assert.assertFalse(new PerfectSquare().isPerfectSquare(2147473647));
    }
}
