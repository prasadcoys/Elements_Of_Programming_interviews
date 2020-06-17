package dynamicprogramming.longestincreasingsubsequence;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LargestDivisibleSetTest {
    @Test
    public void testIfWeCanGetLargestDivisibleSetWith2DivisibleIntegers(){
        int[] nums = new int[]{1,2};
        List<Integer> expected = addArrayToListOfList(new int[]{1,2});
        List<Integer> actual =
                new LargestDivisibleTest().largestDivisibleSubset(nums);
        Assert.assertEquals(expected.size(),actual.size());
        expected.removeAll(actual);
        Assert.assertTrue(expected.size()==0);
    }

    @Test
    public void testIfWeGetEmptyListWhenTheyAreNotDivisbleByEachother(){
        int[] nums = new int[]{2,3};
        List<Integer> expected = addArrayToListOfList(new int[]{3});
        List<Integer> actual =
                new LargestDivisibleTest().largestDivisibleSubset(nums);
        Assert.assertEquals(expected.size(),actual.size());
    }

    @Test
    public void testIfLargestDivisibleSetFor3elements(){
        int[] nums = new int[]{1,2,3};
        List<Integer> expected = addArrayToListOfList(new int[]{1,2});
        List<Integer> actual =
                new LargestDivisibleTest().largestDivisibleSubset(nums);
        Assert.assertEquals(expected.size(),actual.size());
        expected.removeAll(actual);
        Assert.assertTrue(expected.size()==0);
    }
    @Test
    public void testIfLargestDivisibleSetFor3elementsINWrongOrder(){
        int[] nums = new int[]{3,2,1};
        List<Integer> expected = addArrayToListOfList(new int[]{1,2});
        List<Integer> actual =
                new LargestDivisibleTest().largestDivisibleSubset(nums);
        Assert.assertEquals(expected.size(),actual.size());
        expected.removeAll(actual);
        Assert.assertTrue(expected.size()==0);
    }

    @Test
    public void testIfWeCanGetLargestDivisibleSetWith2DivisibleIntegersInWrongOrder(){
        int[] nums = new int[]{2,1};
        List<Integer> expected = addArrayToListOfList(new int[]{1,2});
        List<Integer> actual =
                new LargestDivisibleTest().largestDivisibleSubset(nums);
        Assert.assertEquals(expected.size(),actual.size());
        expected.removeAll(actual);
        Assert.assertTrue(expected.size()==0);
    }

    @Test
    public void testIfWeGetLargestDivisibleSetIf2ndAnd3rdElementAreDivisble(){
        int[] nums = new int[]{3,4,8};
        List<Integer> expected = addArrayToListOfList(new int[]{4,8});
        List<Integer> actual =
                new LargestDivisibleTest().largestDivisibleSubset(nums);
        Assert.assertEquals(expected.size(),actual.size());
        expected.removeAll(actual);
        Assert.assertTrue(expected.size()==0);
    }

    @Test
    public void testIfWeCanFindLargestDivisibleSetOf1_2_4_8(){
        int[] nums = new int[]{1,2,4,8};
        List<Integer> expected = addArrayToListOfList(new int[]{1,2,4,8});
        List<Integer> actual =
                new LargestDivisibleTest().largestDivisibleSubset(nums);
        System.out.println(actual);
        Assert.assertEquals(expected.size(),actual.size());
        expected.removeAll(actual);
        Assert.assertTrue(expected.size()==0);
    }

    @Test
    public void testIfWeGetSameElementIfSizeEqualsOne(){
        int[] nums = new int[]{1};
        List<Integer> expected = addArrayToListOfList(new int[]{1});
        List<Integer> actual =
                new LargestDivisibleTest().largestDivisibleSubset(nums);
        Assert.assertEquals(expected.size(),actual.size());
    }



    @NotNull
    private List<Integer> addArrayToListOfList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num :
                array) {
            list.add(num);
        }
        return list;
    }
}
