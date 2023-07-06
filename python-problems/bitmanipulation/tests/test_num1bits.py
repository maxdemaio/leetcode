from bitmanipulation.num1bits import Solution


def test_hammingWeight():
    solution = Solution()

    num = 3
    expected = 2
    assert solution.hammingWeight(num) == expected

