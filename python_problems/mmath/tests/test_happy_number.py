from mmath.happy_number import Solution

def test_happy_number():
    solution = Solution()

    num_uwu = 19
    assert solution.isHappyNaive(num_uwu) is True

    num_uwu = 2
    assert solution.isHappyNaive(num_uwu) is False
