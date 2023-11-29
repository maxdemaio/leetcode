from typing import *

"""
Approach/Notes:
My approach was similar to how we solved stairs.py
You build the possible paths of step 3 with steps 1/2 (bc you can get to step 3 from those 2)
But this time, you just update the array with the minimum cost (from prev paths)
Then at the end you choose either the final step or 2 steps before

Time complexity:
O(n)

Space complexity:
My orig had O(n) to maintain a minimum cost array
but actually you can have O(1)
if you use the original array given to you
to store the minimum value for each step at each index

"""

class Solution:
    def minCostClimbingStairsOrig(self, cost: List[int]) -> int:
        n = len(cost)
        # If there are only 2 stairs, return min of 2
        if n <= 2:
            return min(cost)

        oneStepAwayCost = cost[1]
        twoStepAwayCost = cost[0]

        # Memoize the min cost of the first two steps
        minCosts = [twoStepAwayCost, oneStepAwayCost]

        # Go up each step, start on step 3
        for i in range(2, n):
            if i == n - 1:
                minCosts.append(min(oneStepAwayCost, twoStepAwayCost + cost[i]))
            else:
                minCosts.append(cost[i] + min(oneStepAwayCost, twoStepAwayCost))
                twoStepAwayCost = minCosts[i - 1]
                oneStepAwayCost = minCosts[i]
        # return minimum
        return minCosts[-1]

    def minCostClimbingStairs(self, cost: List[int]) -> int:
        # DP we use the given array to form the result
        for i in range(2, len(cost)):
            cost[i] += min(cost[i - 1], cost[i - 2])

        return min(cost[-1], cost[-2])
