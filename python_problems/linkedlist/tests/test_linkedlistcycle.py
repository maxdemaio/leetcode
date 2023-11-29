from linkedlist.linkedlistcycle import Solution
from linkedlist.util import setup_linked_list_with_cycle, setup_linked_list


def test_mergeTwoLists():
    solution = Solution()

    # setup LL with cycle
    inputList = [3,2,0,-4]
    linkedlost = setup_linked_list_with_cycle(inputList, 1)

    assert solution.hasCycle(linkedlost) == True

    # setup normal LL
    linkedlost = setup_linked_list(inputList)
    assert solution.hasCycle(linkedlost) == False
