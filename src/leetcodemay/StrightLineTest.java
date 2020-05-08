package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class StrightLineTest {

    @Test
    public void testIfGivenPointsInStraightLineWegetTrue(){
        int[][] coordinates = new int[][]{
                {1,2},{2,3},{3,4},{4,5},{5,6},{6,7}
        };
        Assert.assertTrue(new StraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void testIfGivenPointsNotInStraightLineWegetFalse(){
        int[][] coordinates = new int[][]
                {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}
        ;
        Assert.assertFalse(new StraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void testIfPointsOnVerticalLineGiveTrue(){
        int[][] coordinates = new int[][]{
                {0,2},{0,3},{0,5},{0,8},{0,10}
        };
        Assert.assertTrue(new StraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void testIfPointsOnVerticalLineWithOneMissingGivesFalse(){
        int[][] coordinates = new int[][]{
                {0,2},{0,3},{0,5},{0,8},{1,10}
        };
        Assert.assertFalse(new StraightLine().checkStraightLine(coordinates));
    }

    @Test
    public void testIfPointsOnHorizontalLineGivesTrue(){
        int[][] coordinates = new int[][] {
                {2,0},{3,0},{4,0},{6,0}
        };
        Assert.assertTrue(new StraightLine().checkStraightLine(coordinates));
    }
    @Test
    public void testIfPointsOnHorizontalLineWithOneMissingGivesFalse(){
        int[][] coordinates = new int[][] {
                {2,0},{3,0},{4,0},{6,1}
        };
        Assert.assertFalse(new StraightLine().checkStraightLine(coordinates));
    }
}
