package backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        recursivelyAddSubsetToSubsets(subsets,nums,
                new ArrayList<Integer>(),0);
        return subsets;
    }

    private void recursivelyAddSubsetToSubsets(List<List<Integer>> subsets, int[] nums, List<Integer> currentSubset,int start) {
        if (nums.length == start){
            subsets.add(currentSubset);
            return;
        }
        recursivelyAddSubsetToSubsets(subsets,nums,currentSubset,start+1);
        List<Integer> subsetWithElement = new ArrayList<>(currentSubset);
        subsetWithElement.add(nums[start]);
        recursivelyAddSubsetToSubsets(subsets,
                nums,
        subsetWithElement,start+1);
    }

}
