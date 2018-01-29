package C_0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntersectionOfTwoSortedArraysTest
{
    @Test
    public void testIfIntersectionOfTwoSortedArraysGivesCorrectResult()
    {
        int[] a = {2,3,5,5,6,7,7,8,12};
        int[] b = {5,5,6,8,8,9,10,10};
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(5);
        expectedList.add(6);
        expectedList.add(8);
        assertEquals(expectedList,ArrayIntersecter.intersect(a,b));
    }

    @Test
    public void testIfIntersectionOfTwoDisjointSetsGivesCorrectResults()
    {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        assertTrue(ArrayIntersecter.intersect(a,b).isEmpty());
    }

    @Test
    public void testIfIntersectionOfTwoEqualSetsGivesTheSameSet()
    {
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(expected,ArrayIntersecter.intersect(a,b));
    }
    @Test
    public void testIfInteserctionOfTwoSingletonsGivesASingleton()
    {
        int[] a = {1};
        int[] b = {1};
        List<Integer> expected  = new ArrayList<>();
        expected.add(1);
        assertEquals(expected,ArrayIntersecter.intersect(a,b));
    }
    @Test
    public void testIfIntersectionBetweenTwoEmptySetsGivesEmptyResult()
    {
        int[] a = {};
        int[] b = {};
        assertTrue(ArrayIntersecter.intersect(a,b).isEmpty());
    }
    @Test
    public void
            testIfIntersectionBetweenTwoSetsThatHaveMultipleInstancesOfSameNumberGivesResultOfOnlyThatNumber()
    {
        int[] a= {1,1,1,1,1};
        int[] b = {1,1,1};
        List<Integer> expected  = new ArrayList<>();
        expected.add(1);
        assertEquals(expected,ArrayIntersecter.intersect(a,b));
    }

}
