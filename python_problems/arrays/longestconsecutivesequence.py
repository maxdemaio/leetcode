from typing import *

"""
Approach/Notes:
Naive we sort and then do some maximum shenanigans 

Optimal first we create a set of the nums for constant lookup time
Then, we find all the starts (nums in the set where there is no [num-1])
We can check that in constant lookup time
Then, whenever we encounter a start, keep iterating until you hit an end and calc max count
from all the starts

Time complexity:
O(n*log(n)) for naive
O(n) for optimal

Space complexity:

O(1) for naive
O(n) for optimal
"""

class Solution:
    def longestConsecutiveNaive(self, nums: List[int]) -> int:
        longest = 0
        curr_longest = 0
        nums.sort()
        for i in range(0, len(nums)):
            if i == 0:
                longest += 1
                curr_longest += 1
            else:
                if nums[i] == nums[i - 1]:
                    continue
                elif nums[i] - 1 == nums[i - 1]:
                    curr_longest += 1
                    longest = max(longest, curr_longest)
                else:
                    curr_longest = 1
        return longest

    def longestConsecutive(self, nums: List[int]) -> int:
        # create set O(n)
        numSet = set(nums)
        longest = 0

        # Ik we are a start of a sequence if there is not (num - 1) of value in set (constant lookup)
        # What we do when doing it manually is you find the starts, and iterate until you can't anymore
        # We will need to do an operation to see how long each of those seq if you know the starting point
        for n in nums:
            # Check if it's the start of a sequence
            if (n - 1) not in numSet:
                length = 1
                while (n + length) in numSet:
                    length += 1
                longest = max(length, longest)
        return longest
