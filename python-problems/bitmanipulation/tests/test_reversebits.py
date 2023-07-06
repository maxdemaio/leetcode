from bitmanipulation.reversebits import Solution


def test_reverseBits():
    solution = Solution()

    # 00000010100101000001111010011100
    num = 43261596
    # 00111001011110000010100101000000
    expected = 964176192
    assert solution.reverseBits(num) == expected

