from stack.dailytemperatures import Solution


def test_dailyTemperatures():
    solution = Solution()

    expected = [1,1,4,2,1,1,0,0]
    assert solution.dailyTemperatures([73,74,75,71,69,72,76,73]) == expected
