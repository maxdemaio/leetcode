from typing import *

"""
Approach/Notes:
Naive approach is sum - sum of nums which gives the missing num

Formula approach is exactly the same but achieves the sum w/o looping

Bitwise approach takes advantage of the communicative property of XOR
When you XOR a number with itself, it equates to 0 since there are no differences
At the end, you'll be left with the number that is unique in that list (adding a duplicate range to orig list)


Time complexity:
Formula approach is O(n) because we still have to sum the input list

Naive approach simplifies to O(n) from O(2n)

Bitwise approach is O(n)


Space complexity:
Formula approach is O(1)

Naive approach is O(1)

Bitwise approach is O(n) because we need to have the list + list which has 1 unique num
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
