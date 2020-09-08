package BitManipulation;

import org.junit.Assert;
import org.junit.Test;

public class OneBitSorterTest {
    @Test
    public void testIfWeCanCalcualateNumberOfOnes() {
        Assert.assertEquals(1,OneBitComparator
                .getNumberOfOnes(1));
        Assert.assertEquals(1, OneBitComparator
                .getNumberOfOnes(2));
        Assert.assertEquals(4, OneBitComparator
                .getNumberOfOnes(15));
    }

    @Test
    public void testIfCompareLogicWorksFine() {
        Assert.assertEquals(-1, OneBitComparator.compareLogic(4, 3));
        Assert.assertEquals(1, OneBitComparator.compareLogic(2, 1));
        Assert.assertEquals(-3, OneBitComparator.compareLogic(16, 15));
    }

    @Test
    public void testIfSortingWorks() {
        int[] expectedArray = new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7};
        Assert.assertArrayEquals(expectedArray,
                new OneBitSorter().sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8
                }));
        expectedArray = new int[]{10, 100, 10000, 1000};
        Assert.assertArrayEquals(expectedArray,
                new OneBitSorter().sortByBits(new int[]{10, 100, 1000,
                        10000
                }));
    }
}
