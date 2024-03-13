from typing import Optional
from linkedlist.util import ListNode

class Solution:
    def removeZeroSumSublists(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # build data structure to store the cumulative sum of the linked list and pointers
        # to the nodes where the cumulative is found
        sum = 0
        temp = ListNode()
        temp.next = head
        map = {0: temp}

        while head:
            sum += head.val
            map[sum] = head  # pointer to list node
            head = head.next

        # remove consecutive zero sum sequences
        sum = 0
        head = temp

        while head:
            sum += head.val
            head.next = map[sum].next
            head = head.next
        return temp.next
