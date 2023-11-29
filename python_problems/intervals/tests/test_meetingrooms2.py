from intervals.meetingrooms2 import Solution


def test_min_meeting_rooms():
    solution = Solution()

    intervals = [(0, 30), (5, 10), (15, 20)]
    """
    We need two meeting rooms
    room1: (0,30)
    room2: (5,10),(15,20)
    """
    assert solution.min_meeting_rooms(intervals) == 2

    intervals = [(2, 7)]
    assert solution.min_meeting_rooms(intervals) == 1

    intervals = [(0, 30), (5, 10), (15, 20)]
    assert solution.min_meeting_rooms(intervals) == 2

    intervals = [(0, 10), (5, 15), (21, 30), (20, 25)]
    assert solution.min_meeting_rooms(intervals) == 2

