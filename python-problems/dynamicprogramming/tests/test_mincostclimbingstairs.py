from dynamicprogramming.mincostclimbingstairs import Solution


def test_minCostClimbingStairs():
    solution = Solution()

    cost = [10, 15, 20]
    assert solution.minCostClimbingStairs(cost) == 15

    cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
    assert solution.minCostClimbingStairs(cost) == 6


def test_minCostClimbingStairsOrig():
    solution = Solution()

    cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
    assert solution.minCostClimbingStairsOrig(cost) == 6

    cost = [10, 15, 20]
    assert solution.minCostClimbingStairsOrig(cost) == 15