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
 * logically it's impossible for the tortoise and hare to point at same node if moving at diff speeds
 * that is, if there's no loop
 *
 * if (hare == tortoise) we report a loop
 * if we reach the end of the list we report no loop
 *
 *
 * Finding start of the loop:
 *
 * Step1: Proceed in the usual way, you will use to find the loop, i.e.
 * Have two pointers, increment one in single step and other in two steps,
 * If they both meet in sometime, there is a loop.
 *
 * Step2: Freeze one pointer where it was and increment the other pointer in one step
 * counting the steps you make and when they both meet again,
 * the count will give you the length of the loop (this is same as counting the number of elements in a circular link list).
 *
 * Step3: Reset both pointers to the start of the link list,
 * increment one pointer to the length of loop times and then start the second pointer.
 * increment both pointers in one step and when they meet again, it will be the start of the loop
 * (this is same as finding the nth element from the end of the link list).
 *
 * https://stackoverflow.com/questions/1536944/detecting-the-start-of-a-loop-in-a-singly-linked-link-list
 * https://www.youtube.com/watch?v=5BpQ5m0K_t4
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
