from arrays.lemonadechange import Solution

def test_lemonadechange():
    solution = Solution()

    # Test case 1
    bills = [5,5,10,10,20]
    expected = False
    assert solution.lemonadeChange(bills) == expected

    # Test case 2
    bills = [5,5,5,10,20]
    expected = True
    assert solution.lemonadeChange(bills) == expected
