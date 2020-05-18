package leetcodemay;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[ 0 ];
        int max_so_far = nums[ 0 ];
        for (int i = 1; i < nums.length; i++) {
            max_so_far = Math.max(nums[ i ], max_so_far + nums[ i ]);
            max_sum = Math.max(max_sum, max_so_far);
        }
        return max_sum;
    }
}
