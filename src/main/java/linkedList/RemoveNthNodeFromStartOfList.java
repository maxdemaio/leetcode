package linkedList;


public class RemoveNthNodeFromStartOfList {
    public ListNode removeNthFromStart(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode dummy = dummyHead;

        for(int i = 0; i < n - 1; i++) {
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return dummyHead.next;
    }
}