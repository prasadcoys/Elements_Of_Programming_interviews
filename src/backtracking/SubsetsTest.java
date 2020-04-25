package backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        Arrays.sort(nums);
        List<List<Integer>> subsets =
                new Subsets().subsets(nums);
        subsets.removeAll(expectedSubsets);
        System.out.println(subsets);
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
