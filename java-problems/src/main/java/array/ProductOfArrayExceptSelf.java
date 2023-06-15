package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelfBrute(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                // index is not the same
                if (j != i && res[i] == 0) {
                    res[i] += nums[j];
                } else if (j != i) {
                    res[i] *= nums[j];
                }
            }
        }
        return res;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.stream(nums).filter()
        return res;
    }
}