package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        recursivelyCalculatePermutationsFor(nums,permutations,new ArrayList<>());
        return permutations;
    }

    private void recursivelyCalculatePermutationsFor(
            int[] nums, List<List<Integer>> permutations,
            List<Integer> currentPermutation) {
        if (nums.length == 0) {
            permutations.add(currentPermutation);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> childPermutation = new ArrayList<>(currentPermutation);
            childPermutation.add(nums[ i ]);
            recursivelyCalculatePermutationsFor(
                    getRemainingNumbers(nums, i)
                    , permutations,
                    new ArrayList<>(childPermutation));
        }
    }


    public int[] getRemainingNumbers(int[] numbers, int position) {
        int[] dest = new int[ numbers.length - 1 ];
        System.arraycopy(numbers, 0, dest, 0, position);
        System.arraycopy(numbers, position + 1, dest, position,
                numbers.length - position - 1);
        return dest;
    }
}
