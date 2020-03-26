package hacker.earth.krypc;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SubssetCreatorTest
{

    @Test
    public void testIfSingleTonsAreCreatedCorrectly()
    {
        int[] inputArray = {1,2,3,4};
        int[][] expectedSubsets = {{1},{2},{3},{4}};
        assertArrayEquals(expectedSubsets,SubsetCreator.createSubSets
                (inputArray,1));

    }

    @Test
    public void testIfCombinationsCalculatedCorrectly()
    {
        int n = 4;
        int r = 2;
        assertEquals(6,SubsetCreator.calculateNCR(n,r));
    }

    @Test
    public void testIfTwoLevelSubsetsAreCorrectlyGiven()
    {
        int[] inputArray = {1,2,3,4};
        int[][] expectedSubsets = {{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}};
        assertArrayEquals(expectedSubsets,SubsetCreator.createSubSets
                (inputArray,2));

    }
}
