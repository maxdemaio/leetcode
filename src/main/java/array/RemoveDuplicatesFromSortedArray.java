package array;

/**
 * @author Max DeMaio
 * Solved on XX/XX/XXXX
 *
 * Remove Duplicates from Sorted Array
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 * Difficulty: Easy
 *
 * Approach: X
 *
 * Time Complexity: X
 * Space Complexity: O(1)
 *
 * @see ArrayTests#validRemoveDuplicatesFromSortedArray()
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
