package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class RemoveKDigitsTest {

    @Test
    public void testIfWeReturn0WhenWeHaveToRemoveAllDigits() {
        String num = "10";
        Assert.assertEquals("0", new RemoveKDigits().removeKdigits(num, 2
        ));
    }

    @Test
    public void testIfWeReturnLeastPossibleNumberWhenWeRemoveAllButOneWithoutZeroes(){
        Assert.assertEquals("1", new RemoveKDigits().removeKdigits("12", 1
        ));
    }

    @Test
    public void testIfWeReturnLeastPossibleNumberWhenWeRemoveTwoFromThreeWithoutZeroes(){
        Assert.assertEquals("1", new RemoveKDigits().removeKdigits("123", 2
        ));
    }
    @Test
    public void testIfWeReturnLeastPossibleNumberWhenWeRemoveAllButOneWithZeroes(){
        Assert.assertEquals("0", new RemoveKDigits().removeKdigits("10", 1
        ));
    }

    @Test
    public void testIfWeReturnLeastPossibleNumberWhenWeRemoveTwoFromThreeWithZeroes(){
        Assert.assertEquals("0", new RemoveKDigits().removeKdigits("120", 2
        ));
    }

    @Test
    public void testIfWeReturnLeastPossibleNumberWhenWeRemove3From1432219(){
        Assert.assertEquals("1219", new RemoveKDigits().removeKdigits(
                "1432219", 3
        ));
    }
    @Test
    public void testIfWeReturnLeastPossibleNumberWhenWeRemove1From10200(){
        Assert.assertEquals("200", new RemoveKDigits().removeKdigits(
                "10200", 1
        ));

    }


    @Test
    public void testIfWeReturnLeastPossibleNumberWhenWeRemove1From112(){
        Assert.assertEquals("11", new RemoveKDigits().removeKdigits(
                "112", 1
        ));
    }
}
