package leetcodemay;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class JewelsAndStonesTest {

    @Test
    public void testIfWeGetZeroWhenNoStoneIsAGem(){
        Assert.assertEquals(0,new JewelsAndStones().numJewelsInStones("abcd",
                "efgefG"));
    }

    @Test
    public void testIfWeGet10WhenAll10ElementsInStoneIsAGem(){
        Assert.assertEquals(10,new JewelsAndStones().numJewelsInStones("abcd"
                , "aabbbcbdac"));
    }

    @Test
    public void testIfWeGet1IfOnlyTheLastStoneIsAGem(){
        Assert.assertEquals(1,new JewelsAndStones().numJewelsInStones(
                "abcd"
                , "efghefghc"));
    }

    @Test
    public void testIfWeGet2IfBothFirstAndLastStonesAreGems(){
        Assert.assertEquals(2,new JewelsAndStones().numJewelsInStones(
                "abcd"
                , "bfghefghc"));
    }

    @Test
    public void testIfWeGet0WhenCasesAreDifferent(){
        Assert.assertEquals(0,new JewelsAndStones().numJewelsInStones(
                "abcd"
                , "BfghefghC"));
    }

    @Test
    public void testIfWeGet1WhenzIsTheNameOfAGem(){
        Assert.assertEquals(0,new JewelsAndStones().numJewelsInStones(
                "z"
                , "ZZ"));
    }
}
