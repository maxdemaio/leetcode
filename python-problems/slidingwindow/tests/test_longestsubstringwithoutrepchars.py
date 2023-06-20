from slidingwindow.longestsubstringwithoutrepchars import Solution

def test_longestsubstringwithoutrepchars():
    solution = Solution()

    # Test case 1
    str = "abcabcbb"
    expected = 3
    assert solution.lengthOfLongestSubstring(str) == expected

    # Test case 2
    str = "bbbbb"
    expected = 1
    assert solution.lengthOfLongestSubstring(str) == expected

    # Test case 3
    str = "pwwkew"
    expected = 3
    assert solution.lengthOfLongestSubstring(str) == expected

    # Test case 4
    str = "aab"
    expected = 2
    assert solution.lengthOfLongestSubstring(str) == expected
