from typing import *
from linkedlist.util import ListNode

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        curr1 = list1
        curr2 = list2
        while curr1 is not None and curr2 is not None:
            print(curr1.val)
            print(curr2.val)
            curr1 = curr1.next
            curr2 = curr2.next
        return None