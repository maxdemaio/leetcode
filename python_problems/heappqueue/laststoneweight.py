from typing import List
from queue import PriorityQueue


class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        if len(stones) == 0:
            return 0
        # set up p queue
        pqueue = PriorityQueue()
        for stone in stones:
            pqueue.put((-1 * stone, stone))

        # smash stones, then re-enter in p-queue
        # repeat
        while not pqueue.empty():
            if pqueue.qsize() >= 2:
                y = pqueue.get(False)[1]
                x = pqueue.get(False)[1]
                if y == x:
                    continue
                if y != x:
                    z = y - x
                    pqueue.put((-1 * z, z))
            elif pqueue.qsize() == 1:
                return pqueue.get(False)[1]
        return 0
