package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class IntervalListIntersectionsTest {

    @Test
    public void testIfWeCanCompareTwoIntevalsInZigZag(){
        int[] A = new int[]{0,2};
        int[] B = new int[]{1,5};
        Assert.assertArrayEquals(new int[]{1,2},
                new IntervalListIntersection().getInterval(A,B));
    }

    @Test
    public void testIfWeCanCompareTwoIntervalsWhereOneIsCompletelyInside(){
        Assert.assertArrayEquals(new int[]{1,3},
                new IntervalListIntersection().getInterval(new int[]{0,5},
                        new int[]{1,3}));
    }

    @Test
    public void testIfWeCanCompareTwoINtervalsWhereOnlyOneElementIsCommon(){
        Assert.assertArrayEquals(new int[]{4,4},
                new IntervalListIntersection().getInterval(new int[]{0,4},
                        new int[]{4,7}));
    }

    @Test
    public void testIfWeCanCompareIntervalList(){
        int[][] a = new int[][]{{0,2},{5,10},{13,23},{24,25}};
        int[][] b = new int[][]{{1,5},{8,12},{15,24},{25,26}};
        Assert.assertArrayEquals(new int[][]{{1,2},{5,5},{8,10},{15,23},
                {24,24},{25,25}},
                new IntervalListIntersection().intervalIntersection(a,b));
    }
}
