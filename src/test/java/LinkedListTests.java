import linkedList.DeleteNodeInLinkedList;
import linkedList.ListNode;

import static org.junit.jupiter.api.Assertions.*;

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

}
