from bitmanipulation.missingnum import Solution
from bitmanipulation.util import show_bits


def test_missingnum():
    solution = Solution()
    print(show_bits(4))
    nums = [3, 0, 1]
    expected = 2
    assert solution.missingNumber(nums) == expected


def test_missingnumnaive():
    solution = Solution()

    nums = [3, 0, 1]
    expected = 2
    assert solution.missingNumberNaive(nums) == expected


def test_missingnumxor():
    solution = Solution()

    nums = [3, 0, 1]
    expected = 2
    assert solution.missingNumberXor(nums) == expected
