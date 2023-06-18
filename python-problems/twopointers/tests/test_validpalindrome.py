from twopointers.validpalindrome import Solution

def test_validpalindrome():
    solution = Solution()

    # Test case 1
    str = "race a car"
    expected = False
    assert solution.isPalindrome(str) == expected

    # Test case 2
    str = "mom"
    expected = True
    assert solution.isPalindrome(str) == expected
