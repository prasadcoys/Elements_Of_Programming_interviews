package dynamicprogramming;

public class NumArray {
    int[] nums;
    int[] sumSoFar;
    public NumArray(int[] nums) {
        this.nums = nums;
        this.sumSoFar = new int[nums.length];
        if(nums.length>0){
            sumSoFar[0] = nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            sumSoFar[i]+= nums[i]+sumSoFar[i-1];
        }
    }
    public int sumRange(int i, int j) {

        return i>0?sumSoFar[j]-sumSoFar[i-1]:sumSoFar[j];
    }
}
