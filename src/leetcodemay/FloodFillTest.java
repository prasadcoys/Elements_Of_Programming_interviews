package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class FloodFillTest {

    @Test
    public void testIfFloodFillForLocationInCenterWorks() {
        int[][] image = new int[][]{
                {1, 1, 1}, {1, 1, 0}, {1, 0, 1}
        };
        int[][] expectedImage = new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0,
                1}};
        Assert.assertArrayEquals(expectedImage,
                new FloodFill().floodFill(image, 1, 1, 2));
    }

    @Test
    public void testIfFloodFillWorksForAReallyLargeMatrix() {
        int[][] image = new int[][]
                {{1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 0, 0},
                        {1, 0, 0, 1, 1, 0, 1, 1},
                        {1, 2, 2, 2, 2, 0, 1, 0},
                        {1, 1, 1, 2, 2, 0, 1, 0},
                        {1, 1, 1, 2, 2, 2, 2, 0},
                        {1, 1, 1, 1, 1, 2, 1, 1},
                        {1, 1, 1, 1, 1, 2, 2, 1},
                };
        int[][] expectedImage = new int[][]{{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 3, 3, 3, 3, 0, 1, 0},
                {1, 1, 1, 3, 3, 0, 1, 0},
                {1, 1, 1, 3, 3, 3, 3, 0},
                {1, 1, 1, 1, 1, 3, 1, 1},
                {1, 1, 1, 1, 1, 3, 3, 1},
        };
        Assert.assertArrayEquals(expectedImage,
                new FloodFill().floodFill(image, 4, 4, 3));

    }
}
