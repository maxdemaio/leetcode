"""
Approach:
set up counter
check lower bit, conditional to increment counter
keep shifting those bits, removing the lower bit! repeat

---
Example:
n = 3
011

compare (3 & 1):
011
001
update counter

compare:
001
001
update counter

compare:
000 (break out of loop)

return 2
---

Time complexity:
The right shift operation (n >>= 1) shifts all the bits of n to the right by one position,
effectively removing the least significant bit.
Since the number of bits in n is log n (in base 2),
the right shift operation takes O(log n) time.

Therefore, in the worst case,
where the value of n has all bits set to 1,
the while loop will iterate log n times,
resulting in a time complexity of O(log n) for the entire function.

Space complexity: O(1)
"""


class Solution:
    def hammingWeight(self, n: int) -> int:
        hamWeight: int = 0
        while n > 0:
            if n & 1:
                hamWeight += 1
            n >>= 1  # shift bits, removing lower bit
        return hamWeight
