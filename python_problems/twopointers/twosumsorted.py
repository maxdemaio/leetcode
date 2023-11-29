from typing import List

"""
Approach/Notes:

Two pointers, one at beg, one at end
[1,3,4,5,7,10,11]

Time complexity: 
naive: O(n^2)

O(n)
https://www.youtube.com/watch?v=cQ1Oz4ckceM
because we're gradually shifting our window and ruling out lower/upper vals


Space complexity: O(1)
"""
class Solution:
    # naive approach
    def twoSum1(self, numbers: List[int], target: int) -> List[int]:
        i = 0
        j = 1

        while i < len(numbers) - 1:
            if numbers[i] + numbers[j] == target:
                return [i + 1, j + 1]
            # greater than target, move both pointers
            elif numbers[i] + numbers[j] > target:
                i += 1
                j = i + 1
            # smaller than target, creep forward 2nd ptr
            else:
                # second ptr reached end, go to next num
                if j == len(numbers) - 1:
                    i += 1
                    j = i + 1
                else:
                    j += 1
        return []

    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l, r = 0, len(numbers) - 1

        while l < r:
            curSum = numbers[l] + numbers[r]

            if curSum > target:
                r -= 1
            elif curSum < target:
                l += 1
            else:
                return [l + 1, r + 1]

        return []
