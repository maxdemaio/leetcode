from math import sqrt
from typing import *


class Solution:
    def pivotIntegerNaive(self, n: int) -> int:
        forward = []
        backward = []
        listy = [i for i in range(1, n + 1)]

        # forward pass
        sum = 0
        for i in range(1, n + 1):
            sum += i
            forward.append(sum)

        # backwards pass
        sum = 0
        for i in range(n, 0, -1):
            sum += i
            backward.append(sum)

        # get answer
        p1 = 0
        p2 = n - 1
        while p1 <= p2:
            if backward[p1] == forward[p2]:
                return listy[p2]
            p1 += 1
            p2 -= 1
        return -1

    def pivotInteger(self, n: int) -> int:
        x = sqrt(n * (n + 1) / 2)
        return int(x) if x % 1 == 0 else -1
