from arrays.longestconsecutivesequence import Solution


def test_longestConsecutive():
    solution = Solution()

    nums = [3, 2, 1, 20, 19, 18, 17, 16]
    assert solution.longestConsecutive(nums) == 5

    nums = [100, 4, 200, 1, 3, 2]
    assert solution.longestConsecutive(nums) == 4

    nums = [9, 8, 7, 6, 5, 4, 3, 2, 1]
    assert solution.longestConsecutive(nums) == 9

    nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
    assert solution.longestConsecutive(nums) == 9

    nums = [1, 2, 0, 1]
    assert solution.longestConsecutive(nums) == 3


def test_longestConsecutiveNaive():
    solution = Solution()

    nums = [3, 2, 1, 20, 19, 18, 17, 16]
    assert solution.longestConsecutiveNaive(nums) == 5

    nums = [100, 4, 200, 1, 3, 2]
    assert solution.longestConsecutiveNaive(nums) == 4

    nums = [9, 8, 7, 6, 5, 4, 3, 2, 1]
    assert solution.longestConsecutiveNaive(nums) == 9

    nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
    assert solution.longestConsecutiveNaive(nums) == 9

    nums = [1, 2, 0, 1]
    assert solution.longestConsecutiveNaive(nums) == 3
