package twopointers;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> currentCombination = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[ i ] == nums[ i - 1 ]) {
                continue;
            }

            currentCombination.add(nums[ i ]);
            calculate3Sum(combinations, currentCombination, i,
                    target - nums[ i ], nums);
            currentCombination.clear();
        }
        return combinations;
    }

    private void calculate3Sum(List<List<Integer>> combinations, List<Integer> currentCombination, int currentPos, int target, int[] nums) {
        for (int i = currentPos + 1; i < nums.length - 2; i++) {
            if (i > currentPos + 1 && nums[ i ] == nums[ i - 1 ]) {
                continue;
            }
//            List<Integer> currentChildCombination =
//                    new ArrayList<>(currentCombination);
            currentCombination.add(nums[ i ]);
            calculate2Sum(combinations, currentCombination, i,
                    target - nums[ i ], nums);
            currentCombination.remove(currentCombination.size()-1);
        }
    }

    private void calculate2Sum(
            List<List<Integer>> combinations,
            List<Integer> currentCombination,
            int currentPos, int target, int[] nums) {
        for (int i = currentPos + 1, j = nums.length - 1; i < j; ) {
            if (i > currentPos + 1 && nums[ i ] == nums[ i - 1 ]) {
                i ++;
                continue;
            }
            if (nums[ i ] + nums[ j ] == target) {
                ArrayList<Integer> e = new ArrayList<>(currentCombination);

                e.add(nums[ i ]);
                e.add(nums[ j ]);

                combinations.add(e);
                i++;
            }
            if (nums[ i ] + nums[ j ] > target) {
                j--;
            } else {
                i++;
            }
        }
    }
}
