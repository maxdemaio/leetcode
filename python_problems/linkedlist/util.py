from typing import *

"""
Static util methods and util classes
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def setup_linked_list_with_cycle(nums: List[int], pos: int) -> Optional[ListNode]:
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

    # Create a cycle by connecting the last node to a node at position 'pos'
    if pos < len(nums):
        cycle_node = head
        for i in range(pos):
            cycle_node = cycle_node.next
        curr.next = cycle_node

    return head

def linked_list_to_list(head: Optional[ListNode]) -> List[int]:
    result = []
    curr = head
    while curr:
        result.append(curr.val)
        curr = curr.next
    return result


def setup_linked_list(nums: List[int]) -> Optional[ListNode]:
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
