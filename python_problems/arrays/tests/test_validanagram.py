from arrays.validanagram import Solution

def test_isAnagram():
    solution = Solution()

    # TC 1
    t = "elvis"
    c = "evils"
    assert solution.isAnagram(t, c) is True

    # TC 2
    t = "jar"
    c = "jam"
    assert solution.isAnagram(t, c) is False
