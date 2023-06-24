from typing import *
from linkedlist.reverselinkedlist import Solution, ListNode


def test_reverseList():
    solution = Solution()

    nums = [1, 2, 3]
    test_linkedlist = setup_linked_list(nums)

    # Test case 1
    reversed_linkedlist = solution.reverseList(test_linkedlist)
    assert linked_list_to_list(reversed_linkedlist) == nums[::-1], "Linked list not reversed correctly"


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
