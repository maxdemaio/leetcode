import linkedList.DeleteNodeInLinkedList;
import linkedList.ListNode;

import static org.junit.jupiter.api.Assertions.*;

import linkedList.RemoveNthNodeFromEndOfList;
import linkedList.RemoveNthNodeFromStartOfList;
import org.junit.jupiter.api.Test;

public class LinkedListTests {

    ListNode setupHead(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        // Set up head node
        ListNode head = new ListNode(array[0]);
        ListNode curr = head;

        // Start from node after head (hence i=1)
        // Add all other nodes
        for (int i = 1; i < array.length; i++) {
            ListNode newNode = new ListNode(array[i]);
            curr.next = newNode;
            curr = newNode;
        }

        // Give back head node
        return head;
    }

    ListNode setupHead12345() {
        return setupHead(new int[] { 1, 2, 3, 4, 5 });
    }

    @Test
    void testDeleteNodeInALinkedList() {
        // Create a new LL with the following nums in int array
        ListNode head = setupHead(new int[]{4, 5, 1, 9});

        // give 5
        new DeleteNodeInLinkedList().deleteNode(head.next);

        assertEquals("[4,1,9]", head.toString());

        head = setupHead(new int[]{4, 5, 1, 9});
        new DeleteNodeInLinkedList().deleteNode(head.next.next);
        assertEquals("[4,5,9]", head.toString());
    }

    @Test
    void testRemoveNthNodeFromEndOfList() {
        ListNode head = setupHead12345();
        assertEquals("[1,2,3,5]", new RemoveNthNodeFromEndOfList().removeNthFromEnd2pass(head, 2).toString());

        head = setupHead12345();
        assertEquals("[1,2,3,4]", new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1).toString());

        head = setupHead12345();
        assertEquals("[2,3,4,5]", new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 5).toString());

        head = setupHead(new int[] { 1 });
        assertEquals(null, new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1));
    }

    @Test
    void testRemoveNthNodeFromStartOfList() {
        ListNode head = setupHead12345();
        assertEquals("[1,3,4,5]", new RemoveNthNodeFromStartOfList().removeNthFromStart(head, 2).toString());

        head = setupHead12345();
        assertEquals("[2,3,4,5]", new RemoveNthNodeFromStartOfList().removeNthFromStart(head, 1).toString());

        head = setupHead12345();
        assertEquals("[1,2,3,4]", new RemoveNthNodeFromStartOfList().removeNthFromStart(head, 5).toString());

        head = setupHead(new int[] { 1 });
        assertEquals(null, new RemoveNthNodeFromStartOfList().removeNthFromStart(head, 1));
    }
}
