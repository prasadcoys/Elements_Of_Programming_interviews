package backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PermutationsTest {

    @Test
    public void testIfPermutationsCanBeCalculated() {
        List<List<Integer>> expectedPermutations = new ArrayList<>();
        int[][] expectedPermutationsInArray = new int[][]{
                {1, 2, 3},
                {1, 3, 2},
                {2, 1, 3},
                {2, 3, 1},
                {3, 1, 2},
                {3, 2, 1}
        };
        addArrayToList(expectedPermutations, expectedPermutationsInArray);
        List<List<Integer>> actualPermutations =
                new Permutations().permute(new int[]{1, 2, 3});
        System.out.println(actualPermutations);
        Assert.assertEquals(expectedPermutations.size(),
                actualPermutations.size());
        actualPermutations.removeAll(expectedPermutations);
        Assert.assertTrue(actualPermutations.isEmpty());
    }

    @Test
    public void testIfPermutationsCanBeCalculatedForFour() {
        List<List<Integer>> expectedPermutations = new ArrayList<>();
        int[][] expectedPermutationsInArray = new int[][]{
                {1, 2, 3, 4}, {1, 2, 4, 3}, {1, 3, 2, 4}, {1, 3, 4, 2}, {1, 4, 2, 3}, {1, 4, 3, 2}, {2, 1, 3, 4}, {2, 1, 4, 3}, {2, 3, 1, 4}, {2, 3, 4, 1}, {2, 4, 1, 3}, {2, 4, 3, 1}, {3, 1, 2, 4}, {3, 1, 4, 2}, {3, 2, 1, 4}, {3, 2, 4, 1}, {3, 4, 1, 2}, {3, 4, 2, 1}, {4, 1, 2, 3}, {4, 1, 3, 2}, {4, 2, 1, 3}, {4, 2, 3, 1}, {4, 3, 1, 2}, {4, 3, 2, 1}
        };
        addArrayToList(expectedPermutations, expectedPermutationsInArray);
        List<List<Integer>> actualPermutations =
                new Permutations().permute(new int[]{1, 2, 3, 4});
        System.out.println(actualPermutations);
        Assert.assertEquals(expectedPermutations.size(),
                actualPermutations.size());
        actualPermutations.removeAll(expectedPermutations);
        Assert.assertTrue(actualPermutations.isEmpty());
    }

    @Test
    public void testIfRemovalFromListIsDoneCorrectly() {
        int[] numbers = new int[]{1, 2, 3};
        int[] remainingNumbers =
                new Permutations().getRemainingNumbers(numbers, 1);
        int[] expected = new int[]{1, 3};
        Assert.assertArrayEquals(expected, remainingNumbers);
    }

    @Test
    public void testIfRemovalFromListIsDoneCorrectlyForFirstElement() {
        int[] numbers = new int[]{1, 2, 3};
        int[] remainingNumbers =
                new Permutations().getRemainingNumbers(numbers, 0);
        int[] expected = new int[]{2, 3};
        Assert.assertArrayEquals(expected, remainingNumbers);
    }



    @Test
    public void testIfRemovalFromListIsDoneCorrectlyForLastElement() {
        int[] numbers = new int[]{1, 2, 3};
        int[] remainingNumbers =
                new Permutations().getRemainingNumbers(numbers, 2);
        int[] expected = new int[]{1, 2};
        Assert.assertArrayEquals(expected, remainingNumbers);
    }

    @Test
    public void testIfPermutations2ForThreeElementsWithDuplicates(){
        List<List<Integer>> expectedPermutations = new ArrayList<>();
        int[][] expectedPermutationsInArray = new int[][]{
                {1, 1, 2},
                {1, 2, 1},
                {2, 1, 1}

        };
        addArrayToList(expectedPermutations, expectedPermutationsInArray);
        List<List<Integer>> actualPermutations =
                new Permutations().permuteUnique(new int[]{1, 1, 2});
        System.out.println(actualPermutations);
        Assert.assertEquals(expectedPermutations.size(),
                actualPermutations.size());
        actualPermutations.removeAll(expectedPermutations);
        Assert.assertTrue(actualPermutations.isEmpty());
    }

    @Test
    public void testIfPermutations2ForThreeElementsWithOnlyOneUniqueElement(){
        List<List<Integer>> expectedPermutations = new ArrayList<>();
        int[][] expectedPermutationsInArray = new int[][]{
                {1, 1, 1}

        };
        addArrayToList(expectedPermutations, expectedPermutationsInArray);
        List<List<Integer>> actualPermutations =
                new Permutations().permuteUnique(new int[]{1, 1, 1});
        System.out.println(actualPermutations);
        Assert.assertEquals(expectedPermutations.size(),
                actualPermutations.size());
        actualPermutations.removeAll(expectedPermutations);
        Assert.assertTrue(actualPermutations.isEmpty());
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

