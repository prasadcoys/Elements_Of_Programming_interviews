package C_0.dynamic.programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceFinderTest
{
    @Test
    public void testIfLCSFinderWorksCorrectly()
    {
        int a[] = {1,2,3,4,5};
        int b[] = {3,4,5,6,7};
        int expectedLCS[] = {3,4,5};
        assertEquals(expectedLCS,LongestCommonSubsequenceFinder.findLCS
                (a,b));
    }
}
