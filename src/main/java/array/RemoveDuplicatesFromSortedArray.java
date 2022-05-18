package array;

/**
 * @author Max DeMaio
 * Solved on 05/17/2022
 *
 * Remove Duplicates from Sorted Array
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 * Difficulty: Easy
 *
 * Approach: once an element is encountered, we bypass its duplicates
 * and move on to the next unique element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int pa = 0;
        int pb = 0;

        while (pa < nums.length) {
            // Unique found
            if (nums[pa] != nums[pb]) {
                nums[pb + 1] = nums[pa];
                pb++;
            }
            pa++;
        }

        return pb + 1;
    }
}
