from typing import *


class Solution:
    def numSubarraysWithSumNaive(self, nums: List[int], goal: int) -> int:
        p1 = 0
        p2 = 0
        total = 0
        for i in range(0, len(nums)):
            j = i
            while j < len(nums):
                if sum(nums[i:j + 1]) == goal:
                    total += 1
                j += 1
        return total

    def numSubarraysWithSumHashmap(self, nums: List[int], goal: int) -> int:
        # counts of sums
        count = {0: 1}
        # cumulative sum
        curr_sum = 0
        total_subarrays = 0

        # iterate through each number
        for num in nums:
            curr_sum += num
            if curr_sum - goal in count:
                # there exists a subarray who's sum is equal to the goal
                total_subarrays += count[curr_sum - goal]
            # this basically counts how many times curr sum occurs
            count[curr_sum] = count.get(curr_sum, 0) + 1
