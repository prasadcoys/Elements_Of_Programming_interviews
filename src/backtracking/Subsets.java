package backtracking;

import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        recursivelyAddSubsetToSubsets(subsets, nums,
                new ArrayList<>(), 0);
        return subsets;
    }

    private void recursivelyAddSubsetToSubsets(List<List<Integer>> subsets, int[] nums, List<Integer> currentSubset, int start) {
        if (nums.length == start) {
            subsets.add(currentSubset);
            return;
        }
        recursivelyAddSubsetToSubsets(subsets, nums, currentSubset, start + 1);
        List<Integer> subsetWithElement = new ArrayList<>(currentSubset);
        subsetWithElement.add(nums[ start ]);
        recursivelyAddSubsetToSubsets(subsets,
                nums,
                subsetWithElement, start + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        Map<String, Boolean> hashcodes = new HashMap<>();
        recursivelyAddNonDuplicateSubsetToSubsets(subsets, nums,
                new ArrayList<>(), 0, hashcodes);
        return subsets;
    }

    private void recursivelyAddNonDuplicateSubsetToSubsets(
            List<List<Integer>> subsets,
            int[] nums,
            List<Integer> currentSubset,
            int start, Map<String, Boolean> hashcodes) {
        if (nums.length == start) {
            String hashCode = calculateHashCode(currentSubset);
            if (hashcodes.containsKey(hashCode)) {
                return;
            }
            subsets.add(currentSubset);
            hashcodes.put(hashCode, true);
            return;
        }
        recursivelyAddNonDuplicateSubsetToSubsets(subsets, nums,
                currentSubset, start + 1, hashcodes);
        List<Integer> subsetWithElement = new ArrayList<>(currentSubset);
        subsetWithElement.add(nums[ start ]);
        recursivelyAddNonDuplicateSubsetToSubsets(subsets,
                nums,
                subsetWithElement, start + 1, hashcodes);
    }

    private String calculateHashCode(List<Integer> currentSubset) {
        String code = "";
        for (int num :
                currentSubset) {
            code += (num);
        }
        System.out.println(code);
        return code;

    }

    public List<List<Integer>> subsetsWithDup2(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        recursivelyAddNonDuplicateSubsetToSubsets2(subsets, nums,
                new ArrayList<>(), 0, true);
        return subsets;
    }

    private void recursivelyAddNonDuplicateSubsetToSubsets2(
            List<List<Integer>> subsets,
            int[] nums,
            List<Integer> currentSubset,
            int start, boolean isTrueTree) {

        if (nums.length <= start) {
            subsets.add(currentSubset);
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
        if (isTrueTree) {
            recursivelyAddNonDuplicateSubsetToSubsets2(subsets, nums,
                    currentSubset, start + 1, false);
            List<Integer> subsetWithElement = new ArrayList<>(currentSubset);
            subsetWithElement.add(nums[ start ]);
            recursivelyAddNonDuplicateSubsetToSubsets2(subsets,
                    nums,
                    subsetWithElement, start + 1, true);
        } else if (i < nums.length) {
            recursivelyAddNonDuplicateSubsetToSubsets2(subsets, nums,
                    currentSubset, i + 1, false);
            List<Integer> subsetWithElement = new ArrayList<>(currentSubset);
            subsetWithElement.add(nums[ i ]);
            recursivelyAddNonDuplicateSubsetToSubsets2(subsets,
                    nums,
                    subsetWithElement, i + 1, true);
        } else {
            subsets.add(currentSubset);
        }
    }
}

