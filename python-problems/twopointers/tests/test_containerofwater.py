from twopointers.containerofwater import Solution


def test_maxArea():
    solution = Solution()

    input = [1,1,1,1,200,200,1,1,1,1]
    assert solution.maxArea(input) == 200

    input = [1,8,6,2,5,4,8,3,7]
    assert solution.maxArea(input) == 49
