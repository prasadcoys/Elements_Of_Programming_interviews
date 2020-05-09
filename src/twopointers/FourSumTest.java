package twopointers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FourSumTest {

    @Test
    public void testIfWeCanGetAllCombinationsThatGiveSum(){
        int[] nums = new int[]{1,0,-1,0,-2,2};
        List<List<Integer>> combinations = new ArrayList<>();
        int[][] comboarray = new int[][]{{-1,0,0,1},{-2,0,0,2},{-2,-1,1,
                2}};
        addArrayToList(combinations,comboarray);
        List<List<Integer>> actualCombinations = new FourSum().fourSum(nums, 0);
        System.out.println(actualCombinations.toString());
        Assert.assertEquals(combinations.size(),actualCombinations.size());
        actualCombinations.removeAll(combinations);
        Assert.assertEquals(0,actualCombinations.size());

    }

    @Test
    public void testIfWeCanGetAllCombinationsThatGiveSumWhereDuplicatesCanResultInResultSet(){
        int[] nums = new int[]{-3,-2,-1,0,0,1,2,3};
        List<List<Integer>> combinations = new ArrayList<>();
        int[][] comboarray = new int[][]{{-3,-2,2,3},{-3,-1,1,3},{-3,0,0,3},{-3,0,1,2},{-2,-1,0,3},{-2,-1,1,2},{-2,0,0,2},{-1,0,0,1}};
        addArrayToList(combinations,comboarray);
        List<List<Integer>> actualCombinations = new FourSum().fourSum(nums, 0);
        System.out.println(actualCombinations.toString());
        Assert.assertEquals(combinations.size(),actualCombinations.size());
        actualCombinations.removeAll(combinations);
        Assert.assertEquals(0,actualCombinations.size());

    }

    @Test
    public void testOneMoreWithDuplicate(){
        int[] nums = new int[]{0,0,0,5,-3,-4,1};
        List<List<Integer>> combinations = new ArrayList<>();
        int[][] comboarray = new int[][]{{-4,-3,0,1}};
        addArrayToList(combinations,comboarray);
        List<List<Integer>> actualCombinations =
                new FourSum().fourSum(nums, -6);
        System.out.println(actualCombinations.toString());
        Assert.assertEquals(combinations.size(),actualCombinations.size());
        actualCombinations.removeAll(combinations);
        Assert.assertEquals(0,actualCombinations.size());
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
