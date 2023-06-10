package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Max DeMaio
 * Solved on 05/18/2022
 *
 * Single Number
 * https://leetcode.com/problems/single-number/
 * Difficulty: Easy
 *
 * Approach: Naive is using a frequency map or hashset.
 * Correct approach is bit manipulation. We use XOR.
 * XOR of a number X and 0 will give you X
 * XOR of a number X and the same number will give you 0
 * result will be the odd one out
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) with the data structure it's O(n)
 *
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }

        return res;
    }

    public int singleNumberMem(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        return set.iterator().next();
    }
}
