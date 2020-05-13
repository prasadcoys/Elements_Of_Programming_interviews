package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class SingleElementInSortedArrayTest {

    @Test
    public void testIfSingleElementInSortedArrayIsWorkingCorrectlyCaseOne(){
        Assert.assertEquals(2,
                new SingleElementInSortedArray().singleNonDuplicate(new int[]{1,1,2,3,
                3,4,
                4,8,8}));
    }

    @Test
    public void testIfSingleElementInSortedArrayIsWorkingCorrectlyCaseTwo(){
        Assert.assertEquals(10,
                new SingleElementInSortedArray().singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }

    @Test
    public void testIfSingleElementInSortedArrayIsWorkingCorrectlyCaseWithOnlyONeelement(){
        Assert.assertEquals(3,
                new SingleElementInSortedArray().singleNonDuplicate(new int[]{3}));
    }

    @Test
    public void testIfSingleElementInSortedArrayIsWorkingCorrectlyCaseWithThreeelements(){
        Assert.assertEquals(2,
                new SingleElementInSortedArray().singleNonDuplicate(new int[]{1,1,2}));
    }

    @Test
    public void testIfSingleElementInSortedArrayIsWorkingCorrectlyWhenElementIsInTheMiddle() {
        Assert.assertEquals(2,
                new SingleElementInSortedArray().singleNonDuplicate(new int[]{1,1,2,3,3}));
    }
}
