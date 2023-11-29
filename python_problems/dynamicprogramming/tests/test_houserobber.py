from dynamicprogramming.houserobber import Solution

def test_rob():
    solution = Solution()

    nums = [3, 1]
    assert solution.rob(nums) == 3

    # Rob house 1 (money = 1) and then rob house 3 (money = 3).
    nums = [1, 2, 3, 1]
    assert solution.rob(nums) == 4

    nums = [2, 7, 9, 3, 1]
    assert solution.rob(nums) == 12

    # We skip 2 houses in this one to rob 12
    nums = [3, 1, 3, 1, 1, 12, 1, 1]
    assert solution.rob(nums) == 19

    nums = [3, 1, 3, 1, 1, 12, 14, 1]
    assert solution.rob(nums) == 21

