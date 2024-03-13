from linkedlist.removezerosumconsecsequences import Solution
from linkedlist.util import setup_linked_list, linked_list_to_list


def test_removeZeroSumSublists():
    solution = Solution()

    list1 = [1,2,3,-3,4]
    test_linkedlist1 = setup_linked_list(list1)

    # Test case 1
    result_linked_list = solution.removeZeroSumSublists(test_linkedlist1)
    assert linked_list_to_list(result_linked_list) == [1, 2, 4], "Linked list did not remove zero consecutive sequences correctly"


