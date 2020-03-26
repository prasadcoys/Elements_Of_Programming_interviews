package hacker.earth.krypc;

import org.junit.Assert;
import org.junit.Test;

public class StringProblemsTest {

    @Test
    public void testIfWeCanCorrectlyFindOutSizeOfLargestSubstringOfASingleCharacterString(){
        String wholeString = "b";
        Assert.assertEquals(1,
                StringAlgorithms.FindLengthOfLargestSubstring(wholeString));
    }

    @Test
    public void testIfWeCanCorrectlyFindOutSizeIfASingleCharacterKeepsRepeating(){
        String wholeString = "bbbbbb";
        Assert.assertEquals(1,
                StringAlgorithms.FindLengthOfLargestSubstring(wholeString));
    }

    @Test
    public void testIfWeCanCorrectlyFindOutSizeForAMixedString(){
        String wholeString = "abcabcbb";
        Assert.assertEquals(3,
                StringAlgorithms.FindLengthOfLargestSubstring(wholeString));
    }

    @Test
    public void testIfWeCanCorrectlyFindOutSizeForAnotherMixedString(){
        String wholeString = "aab";
        Assert.assertEquals(2,
                StringAlgorithms.FindLengthOfLargestSubstring(wholeString));
    }

    @Test
    public void testIfWeCanCorrectlyFindOutSizeForAnotherMixedString_1(){
        String wholeString = "dvdf";
        Assert.assertEquals(3,
                StringAlgorithms.FindLengthOfLargestSubstring(wholeString));
    }
}
