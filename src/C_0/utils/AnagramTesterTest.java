package C_0.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTesterTest
{

    @Test
    public void testIfAnagramTesterIdentifiesCorrectAnagramsCorrectly()
    {
        assertTrue(AnagramTester.testIfBothAreAnagrams("levis","slive"));
    }

    @Test
    public void testIfAnagramTesterIdentifiesInCorrectAnagramsCorrectly()
    {
        assertFalse(AnagramTester.testIfBothAreAnagrams("levis",
                "alive"));
    }

    @Test
    public void testIfWordsOfDifferentLengthAreClassifiedCorrectly()
    {
        assertFalse(AnagramTester.testIfBothAreAnagrams("abc","abcd"));
    }
}
