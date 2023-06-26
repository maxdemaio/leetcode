from typing import *
from linkedlist.util import ListNode


"""
Approach/Notes:


recursion:
---
4  
---
4  ->  4  
---
3  ->  4  ->  4  
---
2  ->  3  ->  4  ->  4  
---
1  ->  2  ->  3  ->  4  ->  4  
---
1  ->  1  ->  2  ->  3  ->  4  ->  4
---

Time complexity: O(n)
Space complexity: 
For the iterative approach O(1)

For the recursive approach it depends on if the language uses tail call optimization
Worst case it would be O(n)
"""
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

    def mergeTwoListsRecursive(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        # Base cases
        if list1 is None:
            return list2
        if list2 is None:
            return list1

        if list1.val < list2.val:
            list1.next = self.mergeTwoListsRecursive(list1.next, list2)
            return list1
        else:
            list2.next = self.mergeTwoListsRecursive(list1, list2.next)
            return list2
