package C_0.dynamic.programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestRepeatedSubsequenceTest
{
    @Test
    public void testIfLongestRepeatedSubsequenceWorks()
    {
        String input = "AABEBCDD";
        String expectedSequence = "ABD";
        assertEquals(expectedSequence,LongestRepeatedSubsequnce.getLRS
                (input));
    }
    @Test
    public void testIfLRSWorks_2()
    {
        String input = "aabb";
        String expectedSequence = "ab";
        assertEquals(expectedSequence,LongestRepeatedSubsequnce.getLRS
                (input));

    }
    @Test
    public void testIfLRSWorks_3()
    {
        String input = "aab";
        String expectedSequence = "a";
        assertEquals(expectedSequence,LongestRepeatedSubsequnce.getLRS
                (input));
    }
}
