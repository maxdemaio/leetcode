from typing import *


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Util:
    def linked_list_to_list(self, head: Optional[ListNode]) -> List[int]:
        result = []
        curr = head
        while curr:
            result.append(curr.val)
            curr = curr.next
        return result

    def setup_linked_list(self, nums: List[int]) -> Optional[ListNode]:
        if len(nums) == 0:
            return None

        # set up head node
        head = ListNode(nums[0])
        curr = head

        # add all other nodes
        for i in range(1, len(nums)):
            new_node = ListNode(nums[i])
            curr.next = new_node
            curr = new_node
        return head