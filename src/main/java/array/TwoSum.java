package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Max DeMaio
 * Solved on 08/13/2021 and 02/22/2022
 *
 * Two Sum
 * https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 *
 * Approach: Hash Map
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in the array
 *
 * @see ArrayTests#validTwoSum()
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create new hashmap to store complements and indexes
        Map<Integer, Integer> num_map = new HashMap<>();

        // Loop until we find a match of number/complement
        for (int i = 0; i < nums.length; i++) {
            if (num_map.containsKey(nums[i])) {
                return new int[] {num_map.get(nums[i]), i};
            }

            // No match, store complement and index in HashMap
            num_map.put(target - nums[i], i);
        }

        // Error no match found
        return new int[] {};
    }
}