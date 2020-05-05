package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterInStringTest {

    @Test
    public void testIfWeGetMinusOneWhenNoMatchisfound(){
        Assert.assertEquals(-1,
                new FirstUniqueCharactersInString().firstUniqChar("aabbcc"));
    }

    @Test
    public void testIfWeGetMinusOneWhenMatchisfound(){
        Assert.assertEquals(0,
                new FirstUniqueCharactersInString().firstUniqChar(
                        "leetcode"));
    }

    @Test
    public void testIfWeGetMinusOneWhenMatchisfoundInSecondCharacter(){
        Assert.assertEquals(2,
                new FirstUniqueCharactersInString().firstUniqChar(
                        "loveleetcode"));
    }




}
