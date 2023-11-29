from typing import *
from linkedlist.reverselinkedlist import Solution
from linkedlist.util import linked_list_to_list, setup_linked_list


def test_reverseList():
    solution = Solution()

    nums = [1, 2, 3]
    test_linkedlist = setup_linked_list(nums)

    # Test case 1
    reversed_linkedlist = solution.reverseList(test_linkedlist)
    assert linked_list_to_list(reversed_linkedlist) == nums[::-1], "Linked list not reversed correctly"




