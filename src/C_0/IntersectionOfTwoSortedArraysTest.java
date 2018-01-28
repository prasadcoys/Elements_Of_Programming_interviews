package C_0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoSortedArraysTest
{
    @Test
    public void testIfIntersectionOfTwoSortedArraysGivesCorrectResult()
    {
        int[] a = {2,3,5,5,6,7,7,8,12};
        int[] b = {5,5,6,8,8,9,10,10};
        int[] expected = { 5,6,8};
        assertEquals(expected,ArrayIntersecter.intersect(a,b));
    }
}
