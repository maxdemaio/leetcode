from typing import *
from intervals.util import Interval

"""
Approach/Notes:

difference array algorithm

Basically they are asking - 
what is the maximum number of overlapping
meetings at one time? Bc that would solve our problem

0) store a variable for max room count and curr room count
1) Sort the start times in ascending order
2) Sort the end times in ascending order
3) Take 2 pointers
  - while there are start times left,
  - if curr start time > curr end time, 
    - There's a new meeting so increase room count, move start time pointer
  - else start time greater than or equal to an end time
    - A meeting has ended so we can decrement the room count and then move the end time pointer

Time complexity:
O(n*log(n)) since it is the largest complexity to sort the intervals

Space complexity:
O(n) because we need to have a copy of the sorted elements

"""

class Solution:
    """
    @param intervals: an array of meeting time intervals
    @return: the minimum number of conference rooms required
    """
    def min_meeting_rooms(self, intervals: List[Interval]) -> int:
        # No meetings
        if len(intervals) == 0:
            return 0

        # Sort the array of meet times into start and end times O(n*log(n))
        starts = sorted(x[0] for x in intervals)
        ends = sorted(x[1] for x in intervals)

        max_rooms = 0
        curr_count = 0
        sp = 0
        ep = 0
        while sp < len(starts):
            # a new meeting has started
            if starts[sp] < ends[ep]:
                curr_count += 1
                max_rooms = max(max_rooms, curr_count)
                sp += 1
            # meeting has ended (also if start = end, we say those don't overlap)
            else:
                curr_count -= 1
                ep += 1
        return max_rooms
