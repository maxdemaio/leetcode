package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Approach: Hash Map
 * we store the complement as the key and the index as the value
 * as we loop across each number, if the complement exists that sums it to the target
 * return the {i, myMap.get(nums[i])}
 * so this would be the curr nums index and then the complement's index
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in the array
 *
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // What are the indices of two nums that add to the target?

        // {complement: index}
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (myMap.containsKey(nums[i])) {
                // complement found, we should return
                return new int[] {i, myMap.get(nums[i])};
            }
            // no match found, store complement and index in hashmap
            myMap.put(target - nums[i], i);
        }
        // nothing found
        return new int[] {};
    }
}