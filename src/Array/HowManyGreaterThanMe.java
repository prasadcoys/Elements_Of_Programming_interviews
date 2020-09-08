package Array;

import java.util.Arrays;

public class HowManyGreaterThanMe {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        int[] result = new int[ nums.length ];
        int[] hashTable = new int[ 101 ];
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {

            if (hashTable[ temp[ i ] ] != 0) {
                continue;
            }
            hashTable[ temp[ i ] ] = i;

        }

        for (int i = 0; i < nums.length; i++) {
            result[ i ] = hashTable[ nums[ i ] ];
        }

        return result;
    }
}
