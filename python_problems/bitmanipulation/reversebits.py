"""
Approach/Notes:
test
The algorithm in plain english –

1. Do the following 32 times (because we have 32 bit integer)
2. left shift res by 1
3. add n%2 to res
4. right shift n by 1

6, represented as a 32-bit int
00000000 00000000 00000000 00000110

Left shifted by one
00000000 00000000 00000000 00001100

Right shifted by one
000000000 00000000 00000000 0000011

---
Time complexity:
For fixed sized ints, 32-bit unsigned for example it's O(1)
because it takes a fixed number of iterations in worst case to shift all the 32 bits of n to the right.

For variable-length integers or the number of bits in n can vary,
the time complexity of the right shift operation would depend on the number of bits in n,
which would be log (base 2) of  n. O(log(n))

Space complexity: O(1)
"""

class Solution:
    def reverseBits(self, n: int) -> int:
        result = 0  # all 32 bits are init as 0

        for i in range(32):
            # left shift bits, removes the highest bit
            # and this will push the bit just set to a higher position
            # eventually the first bit set will end up at position 31
            result = result << 1

            # get if lowest bit is a 0 or a 1
            # because if it's divisible by 2, the lowest bit will be 0
            bit = n % 2

            # adding 1 will basically set a 1 in the lowest bit position
            # then we will move it along with the left shift
            result = result + bit

            # right shift to get the next bit
            n = n >> 1

        return result
