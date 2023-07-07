from typing import *

"""

"""

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sum1 = n * (n+1) // 2
        return sum1 - sum(nums)

    def missingNumberNaive(self, nums: List[int]) -> int:
        sum1 = 0
        sum2 = 0
        for i in range(0, len(nums) + 1):
            sum1 += i

        for num in nums:
            sum2 += num
        return sum1 - sum2

    def missingNumberXor(self, nums: List[int]) -> int:
        nums = nums + list(range(0, len(nums) + 1))
        ans = 0
        for i in nums:
            ans ^= i
        return ans
