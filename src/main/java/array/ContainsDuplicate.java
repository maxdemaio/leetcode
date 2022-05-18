package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Max DeMaio
 * Solved on 05/18/2022
 *
 * Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * Difficulty: Easy
 *
 * Approach: Hashset contains unique nums, if we have seen before, return true.
 * Otherwise, we return false.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @see ArrayTests#validContainsDuplicate()
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (mySet.contains(nums[i])) {
                return true;
            }
            mySet.add(nums[i]);
        }

        return false;
    }
}
