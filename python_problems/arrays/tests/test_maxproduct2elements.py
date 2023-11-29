from arrays.maxproduct2elements import Solution


def test_maxProduct():
    solution = Solution()

    # Test case 1
    nums = [3, 4, 5, 2]
    expected = 12
    assert solution.maxProduct(nums) == expected

    # Test case 2
    nums = [1, 5, 4, 5]
    expected = 16
    assert solution.maxProduct(nums) == expected
