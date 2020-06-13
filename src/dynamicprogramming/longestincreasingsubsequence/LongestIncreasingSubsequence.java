package dynamicprogramming.longestincreasingsubsequence;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int globalMaximum = 1;
        int[] dpTable = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dpTable[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            int localMaximum = dpTable[i];
            for (int j = 0; j <i ; j++) {
                if ( nums[i]>nums[j]){
                    localMaximum = Math.max(dpTable[j]+dpTable[i],
                            localMaximum);
                }
            }
            dpTable[i] = localMaximum;
            globalMaximum = Math.max(globalMaximum,localMaximum);
        }
        return globalMaximum;
    }
}
