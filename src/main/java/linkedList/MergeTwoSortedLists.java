package linkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Max DeMaio
 * Solved on 06/01/2022
 *
 * Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * Difficulty: Easy
 *
 * Approach: Make our own sep list
 * Set next node to the smaller value of the two nodes
 * if it's the same, just add both
 *
 * Time Complexity: O(n) where n is the size of list1+list2
 * Space Complexity: O(n) where n is the size of list1+list2
 *
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                // list 1 node smaller
                curr.next = list1;
                list1 = list1.next;
            } else {
                // list 2 node smaller
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // edge cases where list lengths aren't the same
        if (list1 != null) {
            curr.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            curr.next = list2;
            list2 = list2.next;
        }

        return dummyHead.next;
    }


}
