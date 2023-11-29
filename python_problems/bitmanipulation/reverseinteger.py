class Solution:
    def reverse(self, x: int) -> int:
        negative = False
        myStr = str(x)
        if myStr[0] == "-":
            negative = True
            myStr = myStr[1:]
        res = int(myStr[::-1])
        if negative:
            res = res * -1
        if res > 2147483647 or res < -2147483648:
            return 0
        return res
