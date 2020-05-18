package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllAnagramsTest {

    @Test
    public void testIfFindAllAnagramsInEmptyStringReturnsEmptyArray(){
        String s = "";
        String p = "a";
        Assert.assertEquals(Collections.EMPTY_LIST,
                new FindAllAnagrams().findAnagrams(s,p));
    }

    @Test
    public void testIfabcIsPresentAsAnagramIncbaebabacd(){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(6);
        Assert.assertEquals(expected,
                new FindAllAnagrams().findAnagrams(s,p));
    }

    @Test
    public void testIfabIsPresentInbaba(){
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        Assert.assertEquals(expected,
                new FindAllAnagrams().findAnagrams("abab","ab"));
    }
}
