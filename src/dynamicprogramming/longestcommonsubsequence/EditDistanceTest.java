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


}
