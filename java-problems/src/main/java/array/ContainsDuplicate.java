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
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> myHashSet = new HashSet<>();
        for (int num: nums) {
            if (myHashSet.contains(num)) {
                return true;
            }
            myHashSet.add(num);
        }
        return false;
    }
}
