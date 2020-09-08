package BitManipulation;

public class SingleManipulation {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            singleNumber ^=nums[i];
        }
        return singleNumber;
    }
}
