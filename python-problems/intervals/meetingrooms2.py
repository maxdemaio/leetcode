from typing import *
from intervals.util import Interval


class Solution:
    """
    @param intervals: an array of meeting time intervals
    @return: the minimum number of conference rooms required
    """
    def min_meeting_rooms(self, intervals: List[Interval]) -> int:
        # No meetings
        if len(intervals) == 0:
            return 0

        rooms = 1
        occ = 1

        # Write your code here
        intervals.sort(key=lambda x: x[0])

        for i in range(1, len(intervals)):
            if intervals[i][0] <= intervals[i - 1][1] and rooms == occ:
                rooms = rooms + 1
                occ = occ + 1
                if occ > 0:
                    occ = occ - 1
        return rooms