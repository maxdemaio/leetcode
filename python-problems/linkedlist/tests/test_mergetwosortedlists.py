from linkedlist.mergetwosortedlists import Solution
from linkedlist.util import setup_linked_list, linked_list_to_list


def test_mergeTwoLists():
    solution = Solution()

    list1 = [1, 2, 4]
    list2 = [1, 3, 4]
    test_linkedlist1 = setup_linked_list(list1)
    test_linkedlist2 = setup_linked_list(list2)

    # Test case 1
    merged_linkedList = solution.mergeTwoLists(test_linkedlist1, test_linkedlist2)
    assert linked_list_to_list(merged_linkedList) == [1, 1, 2, 3, 4, 4], "Linked lists not merged correctly"

    list3 = [2, 2, 4]
    list4 = [1, 8, 9]
    test_linkedlist3 = setup_linked_list(list3)
    test_linkedlist4 = setup_linked_list(list4)

    # Test case 2
    merged_linkedList = solution.mergeTwoLists(test_linkedlist3, test_linkedlist4)
    assert linked_list_to_list(merged_linkedList) == [1, 2, 2, 4, 8, 9], "Linked lists not merged correctly"


def test_mergeTwoSortedListsRecursive():
    solution = Solution()

    list5 = [1, 2, 4]
    list6 = [1, 3, 4]
    test_linkedlist5 = setup_linked_list(list5)
    test_linkedlist6 = setup_linked_list(list6)

    # Test case 3
    merged_linkedList = solution.mergeTwoListsRecursive(test_linkedlist5, test_linkedlist6)
    assert linked_list_to_list(merged_linkedList) == [1, 1, 2, 3, 4, 4], "Linked lists not merged correctly"

