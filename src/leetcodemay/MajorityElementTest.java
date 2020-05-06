package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void testIfMajorityElementIsFoundInArrayOfThreeElements(){
        Assert.assertEquals(3,
                new MajorityElement().majorityElement(new int[]{3,2,3}));
    }
    @Test
    public void testIfMajorityElementIsFoundInArrayOfSevenElements(){
        Assert.assertEquals(2,
                new MajorityElement().majorityElement(new int[]{2,2,1,1,
                        1,2,2
                }));
    }
}
