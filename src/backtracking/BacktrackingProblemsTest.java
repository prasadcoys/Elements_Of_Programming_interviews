package backtracking;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingProblemsTest {


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
        int[] nums = new int[]{9, 0, 3, 5, 7};
        List<List<Integer>> subsets =
                new Subsets().subsets(nums);
        subsets.removeAll(expectedSubsets);
        System.out.println(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsduplicates() {
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{1}, {2}, {1, 2}, {2, 2},
                {1, 2, 2}, {}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup2(new int[]{1, 2, 2});
        System.out.println(subsets);
        Assert.assertEquals(expectedSubsets.size(), subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsOnlyduplicates() {
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{2}, {2, 2}, {2, 2, 2}, {}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup2(new int[]{2, 2, 2});
        System.out.println(subsets);
        Assert.assertEquals(expectedSubsets.size(), subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsduplicatesFor0() {
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{0}, {}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup(new int[]{0});
        System.out.println(subsets);
        Assert.assertEquals(expectedSubsets.size(), subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    @Ignore
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsNoDuplicatesFor0() {
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{0}, {}, {1}, {4}, {4, 1}, {4, 0},
                {1, 0}, {4, 1, 0}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup(new int[]{4, 1, 0});
        System.out.println(subsets);
        Assert.assertEquals(expectedSubsets.size(), subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfSubsetsWithoutDuplicatesAreGeneratedIfArrayContainsNoDuplicatesForNegativeNumber() {
        List<List<Integer>> expectedSubsets = new ArrayList<>();
        int[][] expectedArray = new int[][]{{}, {-1}, {-1, 1}, {-1, 1, 2}, {-1,
                2}, {1}, {1, 2}, {2}};
        addArrayToList(expectedSubsets, expectedArray);

        List<List<Integer>> subsets =
                new Subsets().subsetsWithDup(new int[]{-1, 1, 2});
        Assert.assertEquals(expectedSubsets.size(), subsets.size());
        subsets.removeAll(expectedSubsets);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testifCombainationsFro4C2CanBeCalculatedCorrectly() {
        List<List<Integer>> expectedCombinations = new ArrayList<>();
        int[][] combinations = new int[][]{{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2,
                4}, {3, 4}};
        addArrayToList(expectedCombinations, combinations);
        List<List<Integer>> subsets =
                new Combinations().combine(4, 2);
        Assert.assertEquals(expectedCombinations.size(), subsets.size());
        subsets.removeAll(expectedCombinations);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testifCombainationsFro5C3CanBeCalculatedCorrectly() {
        List<List<Integer>> expectedCombinations = new ArrayList<>();
        int[][] combinations = new int[][]{{1, 2, 3}, {1, 2, 4}, {1, 2, 5}, {1, 3, 4}
                , {1, 3, 5}, {1, 4, 5}, {2, 3, 4}, {2, 3, 5}, {2, 4, 5}, {3, 4, 5}};
        addArrayToList(expectedCombinations, combinations);
        List<List<Integer>> subsets =
                new Combinations().combine(5, 3);
        Assert.assertEquals(expectedCombinations.size(), subsets.size());
        subsets.removeAll(expectedCombinations);
        Assert.assertTrue(subsets.isEmpty());
    }

    @Test
    public void testIfCombainationSumCanBeCalculatedForNumbersInAscendingOrder() {
        List<List<Integer>> expectedCombinations = new ArrayList<>();
        int[][] combinations = new int[][]{{7}, {2, 2, 3}};
        addArrayToList(expectedCombinations, combinations);
        List<List<Integer>> actualCombinations =
                new Combinations().combinationSum(new int[]{2, 3, 6, 7}, 7);
        for (List<Integer> combination : actualCombinations
        ) {
            System.out.println(combination);
        }
        Assert.assertEquals(expectedCombinations.size(),
                actualCombinations.size());
        actualCombinations.removeAll(expectedCombinations);
        Assert.assertTrue(actualCombinations.isEmpty());

    }

    @Test
    public void testIfCombainationSumCanBeCalculatedForNumbersInANyOrder() {
        List<List<Integer>> expectedCombinations = new ArrayList<>();
        int[][] combinations = new int[][]{{2, 2, 2, 2, 2, 2, 2, 2}, {2, 2, 2, 2, 2, 2, 4}, {2, 2, 2, 2, 2, 6}, {2, 2, 2, 2, 4, 4}, {2, 2, 2, 4, 6}, {2, 2, 2, 5, 5}, {2, 2, 4, 4, 4}, {2, 2, 5, 7}, {2, 2, 6, 6}, {2, 4, 4, 6}, {2, 4, 5, 5}, {2, 7, 7}, {4, 4, 4, 4}, {4, 5, 7}, {4, 6, 6}, {5, 5, 6}};
        addArrayToList(expectedCombinations, combinations);
        List<List<Integer>> actualCombinations =
                new Combinations().combinationSum(new int[]{4, 2, 7, 5, 6},
                        16);

        actualCombinations.removeAll(expectedCombinations);
        Assert.assertTrue(actualCombinations.isEmpty());

    }

    @Test
    public void testIfCombinationSum2CanBeCalculatedProperly() {
        List<List<Integer>> expectedCombinations = new ArrayList<>();
        int[][] combinations = new int[][]{{5}, {1, 2, 2}};
        addArrayToList(expectedCombinations, combinations);
        int[] candidates = new int[]{2, 5, 2, 1, 2};
        List<List<Integer>> actualCombinations =
                new Combinations().combinationSum2(candidates, 5);
        Assert.assertEquals(expectedCombinations.size(),
                actualCombinations.size());
        actualCombinations.removeAll(expectedCombinations);
        Assert.assertTrue(actualCombinations.isEmpty());

    }

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
        addArrayToList(expectedPermutations,expectedPermutationsInArray);
        List<List<Integer>> actualCombinations =
                new Permutations().permute(new int[]{1,2,3});
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
