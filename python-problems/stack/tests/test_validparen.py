from stack.validparen import Solution

def test_validparen():
    solution = Solution()

    # Test case 1
    str = "()"
    expected = True
    assert solution.isValid(str) == expected
    assert solution.isValidWithMapHelper(str) == expected
