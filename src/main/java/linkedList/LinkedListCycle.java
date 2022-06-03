package linkedList;

/**
 * @author Max DeMaio
 * Solved on 06/03/2022
 *
 * Linked List Cycle
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
 * Difficulty: Easy
 *
 * Approach: Tortoise and hare
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }


        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
