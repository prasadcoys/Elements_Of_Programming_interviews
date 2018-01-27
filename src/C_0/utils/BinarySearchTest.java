package C_0.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest
{

    @Test
    public void testIfBinarySearchWorksForAnElementThatIsPresent()
    {
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(4,BinarySearch.find(5,sortedArray));
    }

    @Test
    public void testIfBinarySearchWorksForAnElementThatIsNotPresent()
    {
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(-1,BinarySearch.find(11,sortedArray));
    }

    @Test
    public void testIfBinarySearchWorksForAnElementIsPresentAtBeginning()
    {
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(0,BinarySearch.find(1,sortedArray));
    }

    @Test
    public void testIfBinarySearchWorksForAnElementIsPresentAtEnd()
    {
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(9,BinarySearch.find(10,sortedArray));
    }

    @Test
    public void
    testIfBinarySearchWorksForAnElementIsSmallerThanAllElemntsAndNotPresent()
    {
        int[] sortedArray = {2,3,4,5,6,7,8,9,10};
        assertEquals(-1,BinarySearch.find(1,sortedArray));
    }


}
