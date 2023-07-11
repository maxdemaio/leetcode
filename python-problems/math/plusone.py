from typing import *


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        # ok so first let's assume easy mode
        if digits[-1] != 9:
            digits[-1] += 1
            return digits
        # [9,9,9]
        # [9,9,0]
        # [9,0,0]
        # [0,0,0]
        # [1,0,0,0]

        # [3,3,9]
        carry = 1
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] == 9 and carry == 1:
                digits[i] = 0
            elif digits[i] != 9 and carry == 1:
                digits[i] += 1
                carry = 0
                break
        if carry == 1:
            digits.insert(0, 1)
        return digits
