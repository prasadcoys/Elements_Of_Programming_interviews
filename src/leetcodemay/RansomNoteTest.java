package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {


    @Test
    public void testIfWeGetFalseWhenNoCharactersMatchBetweenRansomAndMagazine(){
        Assert.assertFalse(new RansomNote().canConstruct("a","b"));
    }

    @Test
    public void testIfWeGetFalseWhenNotAllCharactersMatchBetweenRansomAndMagazine(){
        Assert.assertFalse(new RansomNote().canConstruct("aa","ab"));
    }

    @Test
    public void testIfWeGetFalseWhenAllCharactersOfRansomAreInMagazine(){
        Assert.assertTrue(new RansomNote().canConstruct("aa","aab"));
    }

    @Test
    public void testIfWeGetTrueWhenRansomContainsaandz(){
        Assert.assertTrue(new RansomNote().canConstruct("az","aabz"));
    }
}
