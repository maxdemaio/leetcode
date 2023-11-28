from typing import List

"""
Approach/Notes:

Greedy algorithm: choosing locally optimal also leads to global solution

Time complexity:
O(n)

Space complexity:
O(1)
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxArea = 0
        while l < r:
            print("pls help me, manpreet")
            currMaxArea = (r - l) * min(height[l], height[r])
            maxArea = max(maxArea, currMaxArea)
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return maxArea
