package array;

/**
 * @author Max DeMaio
 * Solved on 05/17/2022
 *
 * Rotate Array
 * https://leetcode.com/problems/rotate-array/
 * Difficulty: Easy
 *
 * Approach: Reverse whole list, reverse first K numbers,
 * reverse last n-k numbers
 * ex) where k = 3 and n = 7
 * 1 2 3 4 5 6 7
 * 7 6 5 4 3 2 1
 * 5 6 7 4 3 2 1
 * 5 6 7 1 2 3 4
 *
 * Time Complexity: X
 * Space Complexity: X
 *
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        // whole list
        reverse(nums, 0, nums.length- 1);

        // k section
        reverse(nums, 0, k- 1);

        // rest of list
        reverse(nums, k, nums.length- 1);

    }

    public int[] rotateWithMem(int[] nums, int k) {
        // remove excess rotation
        k = k % nums.length;
        if (k == 0) {
            return null;
        }

        // second array with O(n) memory
        int[] newNums = new int[nums.length];

        // get index of start of ending nums to push to front
        int endingstart = nums.length - k;
        int i = 0;

        while (endingstart < nums.length) {
            newNums[i] = nums[endingstart];
            i++;
            endingstart++;
        }

        // finish rest of array
        endingstart = nums.length - k;
        int j = 0;
        while (j < endingstart) {
            newNums[i] = nums[j];
            i++;
            j++;
        }

        return newNums;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
