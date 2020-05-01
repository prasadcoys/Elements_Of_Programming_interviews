package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {

    static int count = 0;
    public List<List<Integer>> combine(int n, int k) {
        int[] numbers = new int[ n ];
        for (int i = 0; i < n; i++) {
            numbers[ i ] = i + 1;
        }
        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            ArrayList<Integer> currentCombination = new ArrayList<>();
            currentCombination.add(numbers[ i ]);
            recursivelyCalculateCombinationsFor(i, combinations,
                    currentCombination, k, numbers);
        }
        return combinations;
    }

    private void recursivelyCalculateCombinationsFor(int startPos, List<List<Integer>> combinations, List<Integer> currentCombination, int k, int[] numbers) {
        if (startPos >= numbers.length) {
            if (currentCombination.size() == k) {
                combinations.add(currentCombination);
                return;
            }
        }
        if (currentCombination.size() == k) {
            combinations.add(currentCombination);
            return;
        }

        int required = k - currentCombination.size();
        int loopend = numbers.length - required;

        for (int i = startPos + 1; i <= loopend; i++) {
            List<Integer> newCurrentCombination =
                    new ArrayList<>(currentCombination);
            newCurrentCombination.add(numbers[ i ]);
            recursivelyCalculateCombinationsFor(i, combinations,
                    newCurrentCombination, k, numbers);
        }
    }

    public List<List<Integer>> combinationSum(
            int[] candidates,
            int target) {
        Arrays.sort(candidates);
        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            int candidate = candidates[ i ];
            if (candidate > target) {
                break;
            }
            List<Integer> currentCombination = new ArrayList<>();
            currentCombination.add(candidate);
            if (candidate == target) {
                combinations.add(currentCombination);
                break;
            }
            int sum = 0;
            recursivelyCalculateCombinationSum(combinations,
                    currentCombination, sum + candidate, candidates,
                    target, i);
        }
        return combinations;
    }

    private void recursivelyCalculateCombinationSum(List<List<Integer>> combinations, List<Integer> currentCombination, int sum, int[] candidates, int target, int startPos) {

        for (int i = startPos; i < candidates.length; i++) {
            int candidate = candidates[ i ];
            if (sum + candidate > target) {
                return;
            }
            List<Integer> newCombination =
                    new ArrayList<>(currentCombination);
            newCombination.add(candidate);
            if (sum + candidate == target) {
                combinations.add(newCombination);
                return;
            }

            recursivelyCalculateCombinationSum(combinations,
                    newCombination, sum + candidate, candidates, target,
                    i);
        }
    }

    public List<List<Integer>> combinationSum2(
            int[] nums,
            int target) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        int currentSum = 0;
        recursivelyAddNonDuplicateSubsetToSubsets2(subsets, nums,
                new ArrayList<>(), 0, true, target,currentSum );
        System.out.println(count);
        return subsets;
    }

    private void recursivelyAddNonDuplicateSubsetToSubsets2(
            List<List<Integer>> subsets,
            int[] nums,
            List<Integer> currentSubset,
            int start, boolean isTrueTree, int target, int sum) {
        if (sum == target){
            subsets.add(currentSubset);
            return;
        }
        if (sum > target){
            return;
        }
        if (nums.length <= start) {
            return;
        }
        if (nums[start] > target) {
            return;
        }
        int i = start;

        if (!isTrueTree) {
            while (i < nums.length) {
                if (nums[ i - 1 ] == nums[ i ]) {
                    i++;
                } else {
                    break;
                }
            }
        }
        if (start == 2){
            System.out.println(i+""+nums[i]);
        }
        if (isTrueTree) {
            recursivelyAddNonDuplicateSubsetToSubsets2(subsets, nums,
                    currentSubset, start + 1, false, target, sum);
            List<Integer> subsetWithElement = new ArrayList<>(currentSubset);
            subsetWithElement.add(nums[ start ]);
            recursivelyAddNonDuplicateSubsetToSubsets2(subsets,
                    nums,
                    subsetWithElement, start + 1, true, target,
                    sum+nums[start]);
        } else if (i < nums.length) {
            recursivelyAddNonDuplicateSubsetToSubsets2(subsets, nums,
                    currentSubset, i + 1, false, target, sum);
            List<Integer> subsetWithElement = new ArrayList<>(currentSubset);
            subsetWithElement.add(nums[ i ]);
            recursivelyAddNonDuplicateSubsetToSubsets2(subsets,
                    nums,
                    subsetWithElement, i + 1, true, target, sum + nums[i]);
        }
    }
}
