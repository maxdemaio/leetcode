from twopointers.twosumsorted import Solution


def test_twoSum():
    solution = Solution()

    input = [2, 7, 11, 15]
    target = 9
    assert solution.twoSum(input, target) == [1, 2]

    input = [2,3,4]
    target = 6
    assert solution.twoSum(input, target) == [1, 3]
