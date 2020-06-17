package dynamicprogramming.longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleTest {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> dpTable = new ArrayList<>();
        int[][] dpArray = new int[nums.length][];
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            List<Integer> numList = new ArrayList<>();
            numList.add(num);
            dpTable.add(numList);
        }
        result = dpTable.get(dpTable.size()-1);

        for (int i = 1; i < nums.length; i++) {
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                tempList = new ArrayList<>();
                if (nums[i]% nums[j] == 0){
                    if(dpTable.get(j).size() >= tempList.size()) {
                        tempList.addAll(dpTable.get(j));
                        tempList.add(nums[ i ]);

                    }
                }


            }
            if(dpTable.get(i).size()<tempList.size()) {
                dpTable.set(i, tempList);
            }
            if(result.size()<tempList.size()){
                result = tempList;

            }
        }

        return result;
    }
}
