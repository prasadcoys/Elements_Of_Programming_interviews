package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class IsSubsequenceTest {

    @Test
    public void testIfStringIsASubsequence(){
        Assert.assertTrue(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void testIfaxcIsNotASubsequenceOfahbgdc(){
        Assert.assertFalse(new IsSubsequence().isSubsequence("axc",
                "ahbgdc"));
    }

    @Test
    public void testIfabcIsASubsequenceOfabc(){
        Assert.assertTrue(new IsSubsequence().isSubsequence("abc",
                "abc"));
    }

    @Test
    public void testIfabcIsNotASubsequenceOfab(){
        Assert.assertFalse(new IsSubsequence().isSubsequence("abc",
                "ab"));
    }
    @Test
    public void testIfEmptyIsASubsequenceofab(){
        Assert.assertTrue(new IsSubsequence().isSubsequence("",
                "ab"));
    }

}
