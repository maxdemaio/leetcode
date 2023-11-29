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

For fixed sized ints, 32-bit unsigned for example it's O(1)
because it takes a fixed number of iterations in worst case to shift all the 32 bits of n to the right.

For variable-length integers or the number of bits in n can vary,
the time complexity of the right shift operation would depend on the number of bits in n,
which would be log (base 2) of  n. O(log(n))

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
