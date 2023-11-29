from intervals.meetingrooms import Solution


def test_can_attend_meetings():
    solution = Solution()

    intervals = [(0, 30), (5, 10), (15, 20)]
    # (0,30), (5,10) and (0,30),(15,20) will conflict
    assert solution.can_attend_meetings(intervals) is False

    intervals = [(5, 8), (9, 15)]
    assert solution.can_attend_meetings(intervals) is True
