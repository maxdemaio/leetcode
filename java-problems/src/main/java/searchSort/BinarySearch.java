package searchSort;

/*
Approach:
Recursion

Time complexity:

Space complexity:

Extra notes:
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        // Case where target not found
        if (left > right) {
            return -1;
        }

        // calculate new midpoint
        int midPoint = left + (right - left) / 2;

        if (nums[midPoint] == target) {
            // target found
            return midPoint;
        } else if (nums[midPoint] > target) {
            // set right as the midpoint, search in left half
            // we don't want to include the midpoint since it's less than the target
            return binarySearch(nums, target, left, midPoint - 1);
        } else {
            // set left as the midpoint, search in the right half
            // we don't want to include the midpoint since it's greater than the target
            return binarySearch(nums, target, midPoint + 1, right);
        }
    }
}
