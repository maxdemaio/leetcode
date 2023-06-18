from arrays.productnotself import Solution

def test_productExceptSelf():
    solution = Solution()

    # Test case 1
    nums = [1, 2, 3, 4]
    expected = [24, 12, 8, 6]
    assert solution.productExceptSelf(nums) == expected
    assert solution.productExceptSelf2(nums) == expected

    # Test case 2
    nums = [-1, 1, 0, -3, 3]
    expected = [0, 0, 9, 0, 0]
    assert solution.productExceptSelf(nums) == expected
    assert solution.productExceptSelf2(nums) == expected
