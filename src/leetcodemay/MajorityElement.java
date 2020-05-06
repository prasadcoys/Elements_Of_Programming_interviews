package leetcodemay;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return  nums[nums.length/2];
    }
}
