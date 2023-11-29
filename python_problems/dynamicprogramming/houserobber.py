from typing import *
"""
Recurrence relationship - way to break up DP problems found in discrete mathematics

Approach/Notes:

The approach is very similar to stairs.py and mincostclimbingstairs.py
You build the maximum robbing amount of the current house based on the previous 2 houses' maximums

You either include the current house and the max of house 2 away, or max of prev adjacent house
But this time, you just update the array with the max robbing amount (from prev houses)
Then at the end you return the final houses robbing amount (which we updated)

Time complexity:
O(n)
Space complexity:
O(1)

"""
class Solution:
    def rob(self, nums: List[int]) -> int:
        # reccurrence relationship
        # rob = max(arr[0] + rob(arr[2:]), rob(arr[1:]))

        rob1, rob2 = 0, 0

        # [rob1, rob2, n, n+1, ...]
        for n in nums:
            temp = max(n + rob1, rob2)  # max that we can rob up until n
            rob1 = rob2
            rob2 = temp
        return rob2


