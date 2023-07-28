from dynamicprogramming.stairs import Solution

def test_climbStairs():
    solution = Solution()

    n = 4
    assert solution.climbStairs(n) == 5

def test_climbStairs2():
    solution = Solution()

    n = 5
    assert solution.climbStairs2(n) == 8