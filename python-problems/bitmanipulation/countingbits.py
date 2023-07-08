from typing import *

"""
Approach/Notes:
For the DP answer:
To sum up, when you meet even number the count of '1's is always the same as its half number, 
on the other hand, remember to plus one to the odds' half number.

Naive:
We convert the int to binary, then to a string and count the 1s


Time complexity:
Optimal DP one is O(n)


log(n) for the bin() function
then convert to str     
Naive one is around O(n^2) because you convert to a string, then have to
loop over that string and count the 1s.

Space complexity:
Both are O(n) since we need to construct the output list
"""

class Solution:
    def countBits(self, n: int) -> List[int]:
        counter = [0]
        for i in range(1, n + 1):
            # you use previous answers to create the current i's count
            # bc the num of 1s is the same as half its num, plus 1 if it's odd
            counter.append(counter[i >> 1] + i % 2)
        return counter

    def countBitsNaive(self, num: int) -> List[int]:
        # one liner vvvv
        # return [bin(i).count('1') for i in range(num + 1)]
        l = []
        for i in range(0, num+1):
            s = str(bin(i))
            l.append(s.count('1'))
        return l