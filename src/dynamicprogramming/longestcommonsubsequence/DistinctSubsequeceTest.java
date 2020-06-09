package dynamicprogramming.longestcommonsubsequence;

import org.junit.Assert;
import org.junit.Test;

public class DistinctSubsequeceTest {

    @Test
    public void testIfRabbbitHas3DistinctSubsequecesofRabbit(){
        Assert.assertEquals(3,new DistinctSubsequence().numDistinct(
                "rabbbit","rabbit"));
    }

    @Test
    public void testIfbabgbagHas5DistinctSubsequecesofbag(){
        Assert.assertEquals(5,new DistinctSubsequence().numDistinct(
                "babgbag","bag"));
    }

    @Test
    public void testIfABCHas0DistinctSubsequencesOfXYZ(){
        Assert.assertEquals(0,new DistinctSubsequence().numDistinct(
                "abc","xyz"));
    }

    @Test
    public void testIfAABBHas2DistinctSubsequencesOfABB(){
        Assert.assertEquals(2,new DistinctSubsequence().numDistinct(
                "aabb","abb"));
    }

    @Test
    public void testIfAnacondastreetracecarHas6DistinctSubsequencesOfContra(){
        Assert.assertEquals(6,new DistinctSubsequence().numDistinct(
                "anacondastreetracecar","contra"));
    }
}
