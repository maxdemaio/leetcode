from typing import List

"""
Approach/Notes:
We have a LIFO monotonic stack that stores indices (start -> end)

First we check, is the next item bigger than me?
If it's not, we add that item's index to the stack and move on

When we finally get to an item where stack[-1] is smaller than curr item in list,
We pop that index off the stack
We calculate the days by taking that i - (index popped off stack) and update results array
We then check if any of the previous ones are smaller and keep going if not (while loop)

Finally always add the current item in list's index to the stack and move on

Time complexity: O(n)
Space complexity: O(n)

"""
class Solution:
    # note: monotonic increasing stack
    # https://leetcode.com/problems/daily-temperatures/solutions/3885602/python-easy-solution-100-beats-98/
    def dailyTemperaturesNaive(self, temperatures: List[int]) -> List[int]:
        ans = []
        for i in range(0, len(temperatures)):
            count = 0
            found = False
            for j in range(i + 1, len(temperatures)):
                count += 1
                # found day with greater temp
                if temperatures[j] > temperatures[i]:
                    found = True
                    break
            # no greater temp found
            if found == False:
                count = 0
            ans.append(count)
        return ans

    def dailyTemperatures(self, temps):
        results = [0] * len(temps)
        stack = []
        for i, temp in enumerate(temps):
            while stack and temps[stack[-1]] < temp:
                index = stack.pop()
                results[index] = i - index
            stack.append(i)

        return results
