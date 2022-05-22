package array;

import java.util.Arrays;

/**
 * @author Max DeMaio
 * Solved on 05/22/2022
 *
 * Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * Difficulty: Easy
 *
 * Approach: Sort both arrays, allocate a result array, use two pointers and add if equal.
 * Return a slice of the array using the Arrays static method
 *
 * Time Complexity: O(max(mlogm, nlogn))
 * Space Complexity: O(min(m, n)) but I just do m + n but then return the min slice
 */

public class IntersectionOfTwoArraysIi {
    public int[] intersect(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int[] result = new int[nums1.length + nums2.length];

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                result[p3] = nums1[p1];
                p1++;
                p2++;
                p3++;
            }
        }

        // Slice of array
        return Arrays.copyOfRange(result, 0, p3);
    }
}
