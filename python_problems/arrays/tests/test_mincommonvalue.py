from arrays.mincommonvalue import Solution


def test_productExceptSelf():
    solution = Solution()

    # Test case 1
    nums1 = [1, 2, 3, 6]
    num2 = [2, 3, 4, 5]
    expected = 2
    assert solution.getCommon(nums1, num2) == expected
