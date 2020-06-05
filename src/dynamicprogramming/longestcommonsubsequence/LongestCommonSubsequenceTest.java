package dynamicprogramming.longestcommonsubsequence;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubsequenceTest {

    @Test
    public void testIfLongestCommonSubsequenceWhenStringsAreEqualCanBeFound() {
        String a = "abc";
        String b = "abc";
        Assert.assertEquals(3,
                new LongestCommonSubsequence().longestCommonSubsequenceDP(a,b));
    }

    @Test
    public void testIfWeReturn0WhenNoElementIsCommonBetweenTwoStrings(){
        String a = "abc";
        String b = "def";
        Assert.assertEquals(0,
                new LongestCommonSubsequence().longestCommonSubsequenceDP(a,b));
    }

    @Test
    public void testIfWeReturn3WhenAllElementsOfString2IsPresentInString1(){
        String a = "abcde";
        String b = "ace";
        Assert.assertEquals(3,
                new LongestCommonSubsequence().longestCommonSubsequenceDP(a,b));
    }
}
