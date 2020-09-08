package BitManipulation;


import org.junit.Assert;
import org.junit.Test;

public class NumberOfStepsTest {

    @Test
    public void testIfWeCanDivideBy2ByRightShifting(){
        Assert.assertEquals(7,14 >> 1);
    }

//    @Test
//    public void testIfWeCanFindOutIfNumberIsOdd(){
//        Assert.assertEquals(true, isOdd(7));
//        Assert.assertEquals(false, isOdd(6));
//    }

    @Test
    public void testIfWeCanFindOutNumberOfStepsFor14(){
        Assert.assertEquals(6, new NumberOfSteps().numberOfSteps(14));
    }

    @Test
    public void testIfweCanFindoutNumberOfStepsFor8(){
        Assert.assertEquals(4, new NumberOfSteps().numberOfSteps(8));
    }

    @Test
    public void testIfWeGetZeroFor0(){
        Assert.assertEquals(0, new NumberOfSteps().numberOfSteps(0));
    }


}
