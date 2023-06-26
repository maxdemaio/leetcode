from typing import *
from linkedlist.mergetwosortedlists import Solution
from linkedlist.util import Util


def test_mergeTwoLists():
    util = Util()
    solution = Solution()

    list1 = [1, 2, 4]
    list2 = [1, 3, 4]
    test_linkedlist1 = util.setup_linked_list(list1)
    test_linkedlist2 = util.setup_linked_list(list2)

    # Test case 1
    merged_linkedList = solution.mergeTwoLists(test_linkedlist1, test_linkedlist2)
    #assert Util.linked_list_to_list(merged_linkedList) == [1, 1, 2, 3, 4], "Linked lists not merged correctly"




