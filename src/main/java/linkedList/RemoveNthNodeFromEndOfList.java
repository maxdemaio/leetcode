package linkedList;

/**
 * @author Max DeMaio
 * Solved on 05/20/2022
 *
 * Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Difficulty: Medium
 *
 * Approach: Fast/Slow pointer
 * First, create a dummy head node that points to head
 * Set slow/fast pointers to dummy head
 * Increment fast until you're at n+1
 * Then start incrementing the slow/fast together until fast = null
 * It's basically like taking (len - n + 1) but in one go
 * Set slow.next = slow.next.next
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 */

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // increment fast until n
        for (int i = 1; i <= n+1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public ListNode removeNthFromEnd2pass(ListNode head, int n) {
        if (head == null)
            return null;

        // get length of list
        ListNode p = head;
        int len = 0;
        while (p != null) {
            len++;
            p = p.next;
        }

        // if remove first node
        int fromStart = len - n + 1;
        if (fromStart == 1)
            return head.next;

        // remove non-first node
        p = head;
        int i = 0;
        while (p != null) {
            i++;
            if (i == fromStart - 1) {
                p.next = p.next.next;
            }
            p = p.next;
        }

        return head;
    }
}
