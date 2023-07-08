from typing import *

class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        if len(bills) == 0:
            return True
        fives = 0
        tens = 0
        twenties = 0
        for bill in bills:
            if bill == 5:
                fives += 1
            elif bill == 10:
                fives -= 1
                tens += 1
            elif bill == 20:
                # always pay w/ 10s if we can, bc it's better to have 5s
                if tens:
                    tens -= 1
                else:
                    fives -= 2
                fives -= 1
                twenties += 1
            if fives < 0 or tens < 0:
                return False
        return True

