from intervals.util import Interval
from typing import *

"""
Approach/Notes: 
Sort based on the starting times
Then we will compare each meeting interval with the previous
If the ending time of the first meeting is greater than the start of the current, they overlap

Time complexity:
Sorting is O(n * log(n) + n) 
which simplifies to O(n * log(n))

Space complexity:
O(1)
"""

class Solution:
    """
    @param intervals: an array of meeting time intervals
    @return: if a person could attend all meetings
    """
    def can_attend_meetings(self, intervals: List[Interval]) -> bool:
        intervals.sort(key=lambda x: x[0])

        for i in range(1, len(intervals)):
            if intervals[i][0] <= intervals[i - 1][1]:
                return False

        return True
