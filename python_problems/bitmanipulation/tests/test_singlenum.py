from bitmanipulation.singlenum import Solution


def test_singleNumber():
    solution = Solution()

    nums = [2, 2, 1]
    expected = 1
    assert solution.singleNumber(nums) == expected

