package dynamicprogramming.longestcommonsubsequence;

import org.junit.Assert;
import org.junit.Test;

public class EditDistanceTest {
    @Test
    public void testIf3IsTheEditDistanceBetweenHorseAndRos(){
        Assert.assertEquals(3,new EditDistance().minDistance("horse",
                "ros"));
    }

    @Test
    public void testIf5IsTheEditDistanceBetweenIntentionAndExecution(){
        Assert.assertEquals(5,new EditDistance().minDistance("intention",
                "execution"));
    }

    @Test
    public void testIf2IsTheEditDistanceBetweenSeaAndEat(){
        Assert.assertEquals(2,new EditDistance().minDistance("sea",
                "eat"));
    }


}
