from typing import *
from linkedlist.util import ListNode

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        cur = head = ListNode()
        while list1 and list2:
            if list1.val < list2.val:
                cur.next = list1
                list1, cur = list1.next, list1
            else:
                cur.next = list2
                list2, cur = list2.next, list2

        # If there are any leftover nodes, assign the rest of the list
        if list1 or list2:
            cur.next = list1 if list1 else list2

        return head.next
