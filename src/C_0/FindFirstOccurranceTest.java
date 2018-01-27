package C_0;

import C_0.utils.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFirstOccurranceTest
{
    @Test
    public void testIfFirstOccurranceWorks()
    {
        int[] sortedArrayWithDuplicates = {1,2,2,3,4,5};
        assertEquals(1, BinarySearch.findFirstOccurrance(2,sortedArrayWithDuplicates));
    }

    @Test
    public void testIfAllElementsAreSameItReturnsFirstIndex()
    {
        int[] sortedArrayWithOnlyOneElement = {1,1,1,1,1,1,1,1};
        assertEquals(0,BinarySearch.findFirstOccurrance(1,sortedArrayWithOnlyOneElement));
    }

    @Test
    public void testIfAllButOneElementsAreSameItReturnsFirstIndex()
    {
        int[] sortedArrayWithOnlyOneElement = {0,1,1,1,1,1,1,1,1};
        assertEquals(1,BinarySearch.findFirstOccurrance(1,
                sortedArrayWithOnlyOneElement));
    }

    @Test
    public void testIfFirstOccurranceWorksIfDuplicateIsOnTheRightSide()
    {
        int[] sortedArrayWithOnlyOneElement = {0,1,2,3,4,5,5,6};
        assertEquals(5,BinarySearch.findFirstOccurrance(5,
                sortedArrayWithOnlyOneElement));
    }
}
