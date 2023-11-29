from bitmanipulation.reverseinteger import Solution


def test_reverse():
    solution = Solution()

    num = 123
    assert solution.reverse(123) == 321

    num = -123
    assert solution.reverse(num) == -321
