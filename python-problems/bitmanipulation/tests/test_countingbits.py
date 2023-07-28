from bitmanipulation.countingbits import Solution
from typing import *


def test_countBits():
    solution = Solution()

    # 00000010100101000001111010011100
    num = 2
    # 00111001011110000010100101000000
    expected = [0, 1, 1]
    assert bitsAreEqual(solution.countBits(num), expected)


def bitsAreEqual(arr1: List[int], arr2: List[int]) -> bool:
    if len(arr1) != len(arr2):
        return False
    for i in range(0, len(arr1)):
        if arr1[i] != arr2[i]:
            return False
    return True
