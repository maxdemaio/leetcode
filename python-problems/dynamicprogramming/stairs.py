"""
Approach/Notes:
If we draw out a decision tree and then use recursion and DFS to find all
the paths that you can reach n steps, it'll be roughly O(2^n) time complexity.
This is bc N is the longest height of the tree (1 step at a time)
You start with one node, and then draw two branches to a new node each time for a new path (1 step or 2 steps)
and you have to make 2 decisions each time
Base case is you hit the step # or go over.

If we discover that we actually keep solving the same subproblems (when you draw the decision tree),
we can cache/memoize the results and then get O(n) time complexity


Time complexity:
Recursion DFS - O(2^n)
Optimal DP caching - O(n)

Space complexity:
Recursion DFS - has stack frames so O(n)
Optimal DP caching - O(1)
"""


class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        if n == 2:
            return 2

        # Memoized results of first 2 steps
        # (Results we know)
        # From the third step, there were 2 ways to get to step 2
        # There was only 1 way to get to step 1
        twoStepAway = 1
        oneStepAway = 2

        currStepPaths = 0

        # Go up each step
        for i in range(2, n):
            # Amount of paths is equal to the sum paths used to get to previous 2 steps
            # [1,2,3,5,8,...]
            # Then we update the variables for the next step
            currStepPaths = twoStepAway + oneStepAway
            twoStepAway = oneStepAway
            oneStepAway = currStepPaths
        return currStepPaths

    def climbStairs2(self, n: int) -> int:
        if n == 1:
            return 1
        if n == 2:
            return 2

        # Memoized results of last 2 steps
        # (Results we know)
        # n = 5
        # Base case of 5 we return 1
        # At 4 we'd return 1
        # sum the memoized results and continue
        one, two = 1, 1

        for i in range(n-1):
            temp = one
            one = one + two
            two = temp
        return one