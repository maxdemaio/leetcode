from heappqueue.laststoneweight import Solution


def test_lastStoneWeight():
    solution = Solution()

    stoneWeights = [2, 7, 4, 1, 8, 1]
    solution.lastStoneWeight(stoneWeights) == 1
