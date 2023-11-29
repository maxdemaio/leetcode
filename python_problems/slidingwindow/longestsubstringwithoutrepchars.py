"""
Approach/Notes:
We use a set bc it has O(1) lookup time and only contains unique elements

We have two pointers to create a sliding window
Once we encounter a duplicate, we keep moving the left pointer (and removing that val in set)
until can start searching for a larger substring w/ no duplicates

Time complexity:
O(n) we only pass through the string once!

Space complexity: O(n)
There could be a string with all unique chars
The set will grow/shrink but no greater than the size of the original string
"""
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charSet = set()
        l = 0
        res = 0

        for r in range(len(s)):
            # keep moving the left pointer
            # until we can start on a unique substring
            while s[r] in charSet:
                charSet.remove(s[l])
                l += 1
            charSet.add(s[r])
            # Take the max of the res and curr substring length
            res = max(res, r - l + 1)
        return res