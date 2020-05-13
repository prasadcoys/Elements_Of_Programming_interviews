package leetcodemay;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[ 0 ];
        }
        int i = 0;
        int j = 1;
        for (; i < nums.length - 1 && j < nums.length; i += 2,
                j += 2) {
            if (nums[ i ] != nums[ j ]) {
                return nums[ i ];
            }
        }

        return nums[ i ];
    }


}
