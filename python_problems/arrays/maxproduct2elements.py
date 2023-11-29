from typing import *

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max1 = [0, 0]
        for i in range(0, len(nums)):
            if nums[i] > max1[0]:
                max1 = [nums[i], i]
        nums[max1[1]] = 0
        return (max1[0] - 1) * (max(nums) - 1)