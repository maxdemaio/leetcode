from typing import Optional
from linkedlist.util import ListNode


"""
Approach: Tortoise and hare
Logically it's impossible for the tortoise and hare to point at the same node if moving at different speeds
That is, if there's no loop.

If (hare == tortoise) we report a loop
If we reach the end of the list, we report no loop


Finding the start of the loop:

Step 1: Proceed in the usual way, you will use to find the loop, i.e.
Have two pointers, increment one in a single step and the other in two steps,
If they both meet at some point, there is a loop.

Step 2: Freeze one pointer where it was and increment the other pointer in one step
Counting the steps you make, and when they both meet again,
The count will give you the length of the loop (this is the same as counting the number of elements in a circular linked list).

Step 3: Reset both pointers to the start of the linked list,
Increment one pointer to the length of the loop times and then start the second pointer.
Increment both pointers in one step, and when they meet again, it will be the start of the loop
(this is the same as finding the nth element from the end of the linked list).

Reference:
https://stackoverflow.com/questions/1536944/detecting-the-start-of-a-loop-in-a-singly-linked-link-list
https://www.youtube.com/watch?v=5BpQ5m0K_t4

Time Complexity: O(n)
Space Complexity: O(1)
"""

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return False

        tortoise = head
        hare = head.next

        while tortoise != hare:
            if hare is None or hare.next is None:
                return False
            tortoise = tortoise.next
            hare = hare.next.next
        return True
