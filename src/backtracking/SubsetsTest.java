package backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SubsetsTest {


    @Test
    public void testIfSubsetsForAnArrayInSortedArrayWorks() {
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{1, 2, 3}, {1}, {2}, {3}, {1, 2}
                , {1, 3}, {2, 3}, {}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets = new Subsets().subsets(new int[]{1, 2, 3});
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());

    }

    @Test
    public void testIfSubsetsForAnArrayInNonSortedArrayWorks() {
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{}, {9}, {0}, {0, 9}, {3}, {3, 9}, {0, 3}, {0, 3, 9}, {5}, {5, 9}, {0, 5}, {0, 5, 9}, {3, 5}, {3, 5, 9}, {0, 3, 5}, {0, 3, 5, 9}, {7}, {7, 9}, {0, 7}, {0, 7, 9}, {3, 7}, {3, 7, 9}, {0, 3, 7}, {0, 3, 7, 9}, {5, 7}, {5, 7, 9}, {0, 5, 7}, {0, 5, 7, 9}, {3, 5, 7}, {3, 5, 7, 9}, {0, 3, 5, 7}, {0, 3, 5, 7, 9}};
        addArrayToList(expectedSubsets, expectedArray);
        int[] nums = new int[]{9,0,3,5,7};
        List<List<Integer>> subsets =
                new Subsets().subsets(nums);
        subsets.removeAll(expectedSubsets);
        System.out.println(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsduplicates(){
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{1},{2},{1,2},{2,2},
                {1,2,2}, {}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup2(new int[]{1, 2, 2});
        System.out.println(subsets);
        Assert.assertEquals(expectedSubsets.size(),subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsOnlyduplicates(){
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{2},{2,2},{2,2,2}, {}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup2(new int[]{2, 2, 2});
        System.out.println(subsets);
        Assert.assertEquals(expectedSubsets.size(),subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsduplicatesFor0(){
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{0}, {}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup(new int[]{0});
        System.out.println(subsets);
        Assert.assertEquals(expectedSubsets.size(),subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsNoDuplicatesFor0(){
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{0}, {},{1},{4},{4,1},{4,0},
                {1,0},{4,1,0}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup(new int[]{4,1,0});
        System.out.println(subsets);
        Assert.assertEquals(expectedSubsets.size(),subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsNoDuplicatesForNegativeNumber(){
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{},{-1},{-1,1},{-1,1,2},{-1,
                2},{1},{1,2},{2}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup(new int[]{-1,1,2});
        Assert.assertEquals(expectedSubsets.size(),subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }
    private void addArrayToList(List<List<Integer>> expectedSubsets, int[][] expectedArray) {
        for (int[] array :
                expectedArray) {
            List<Integer> list = new ArrayList<>();
            for (int num :
                    array) {
                list.add(num);
            }
            expectedSubsets.add(list);
        }
    }


}
