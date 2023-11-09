from mmath.count_number_of_homogenous_substrings import Solution

def test_countHomogenous():
    solution = Solution()

    s = "abbcccaa"
    assert solution.countHomogenous(s) == 13