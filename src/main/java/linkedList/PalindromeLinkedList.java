package linkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Max DeMaio
 * Solved on 06/02/2022
 * <p>
 * Palindrome Linked List
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772/
 * Difficulty: X
 * <p>
 * Approach: We can use a fast and slow pointer to get the center of the list,
 * then reverse the second list and compare two sublists. The time is O(n) and space is O(1).
 * <p>
 * This is similar to deleting Nth node from end of list
 * <p>
 * Time Complexity: X
 * Space Complexity: X
 */

// We can create a new list in reversed order and then compare each node. The time and space are O(n) too
// Or we can copy into array list and then use 2 pointer technique

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        // find list center
        ListNode fast = head;
        ListNode slow = head;

        // jump 2 nodes at a time for fast
        // jump 1 node at a time for slow
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Note: if it's odd, it's ok we don't need to compare the middle val

        // now slow is in the middle
        // and fast is 1 away from the end or @ end
        // 1--2--3--4--5--6
        //       s     f

        // grab second part of list before we reverse
        ListNode secondHead = slow.next;

        // setups up first part list like this
        // 1--2--3--null
        slow.next = null;

        // reverse second part of the list
        // 4--5--6
        // p
        ListNode p = secondHead;
        ListNode prev = null;
        ListNode next = null;

        while (p != null) {
            next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        secondHead = prev;

        // now list is like this
        // 6--5--4

        // compare two sublists now
        while (secondHead != null) {
            if (secondHead.val != head.val)
                return false;
            secondHead = secondHead.next;
            head = head.next;
        }

        return true;
    }

    public boolean isPalindromeWithList(ListNode head) {
        List<Integer> myList = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            myList.add(curr.val);
            curr = curr.next;
        }

        // 2 pointer approach

        int i = 0;
        int j = myList.size() - 1;

        while (i < j) {
            if (myList.get(i) != myList.get(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}

