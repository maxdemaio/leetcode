from typing import *


# Approach:
# Time complexity: O(n)
# Space complexity: O(1)
# Extra notes:

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length: int = len(nums)
        sol: List[int] = [1]*length  # array the same size as nums [1,1,1,...]
        pre: int = 1
        post: int = 1
        for i in range(length):
            sol[i] *= pre
            pre = pre*nums[i]
            sol[length-i-1] *= post
            post = post*nums[length-i-1]
        return sol
