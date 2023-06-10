package linkedList;

/* Write a function to delete a node in a singly-linked list.
You will not be given access to the head of the list,
instead you will be given access to the node to be deleted directly.
It is guaranteed that the node to be deleted is not a tail node in the list.
*/

/**
 * @author Max DeMaio
 * Solved on 05/19/2022
 *
 * Delete Node in a Linked List
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Difficulty: Easy
 *
 * Approach: Steal value and reference of the next node in linked list
 *
 * Time Complexity: Always 2 operations, so we'd assume O(1)
 * Space Complexity: O(1)
 *
 */

public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        // Basically steal next node's value
        node.val = node.next.val;
        // Steal next node's ref
        node.next = node.next.next;
    }
}

