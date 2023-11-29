from typing import Optional
from linkedlist.util import ListNode

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return False
        
        tortoise = head
        hare = head.next

        while tortoise != hare:
            if hare == None or hare.next == None:
                return False
            tortoise = tortoise.next
            hare = hare.next.next
        return True
