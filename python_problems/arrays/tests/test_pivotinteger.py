from arrays.pivotinteger import Solution


def test_maxProduct():
    solution = Solution()

    n = 8
    pivot_result = solution.pivotInteger(n)
    assert pivot_result == 6

    n = 4
    pivot_result = solution.pivotInteger(n)
    assert pivot_result == -1
