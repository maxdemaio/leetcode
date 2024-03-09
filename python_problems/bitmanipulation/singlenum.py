from typing import *

"""
Approach/Notes:
The ^ (Bitwise exclusive-or) 
operator compares each bit and set it to 1 if only one is 1 (if they don't match),
otherwise (if both are 1 or both are 0) it is set to 0:

6 = 0000000000000110
3 = 0000000000000011
--------------------
5 = 0000000000000101
====================

Time complexity: O(n)
Space complexity: O(1)
"""
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for num in nums:
            res ^= num
        return res
