from typing import *
from linkedlist.reverselinkedlist import Solution
from linkedlist.util import Util


def test_reverseList():
    util = Util()
    solution = Solution()

    nums = [1, 2, 3]
    test_linkedlist = util.setup_linked_list(nums)

    # Test case 1
    reversed_linkedlist = solution.reverseList(test_linkedlist)
    assert util.linked_list_to_list(reversed_linkedlist) == nums[::-1], "Linked list not reversed correctly"




