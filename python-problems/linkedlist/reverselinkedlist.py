from typing import *

"""
Approach/Notes:
3 pointers
it's best to use Excalidraw / a diagram with this one to show each loop

we start off w/ prev as null
curr = head

We loop while curr isn't null:
To not lose track of the 3rd you use nxt
we swap the direction of the curr.next pointer
update prev
update curr

Time complexity: 
O(n) have to loop through each node 

Space complexity: 
O(1) we only use 3 pointer variables
and it doesn't scale with the input size!
"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Setup prev/curr node
        prev = None
        cur = head
        while cur:
            nxt = cur.next
            cur.next = prev
            prev = cur
            cur = nxt
        # Set new head
        head = prev
        return head