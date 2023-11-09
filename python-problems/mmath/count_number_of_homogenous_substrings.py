class Solution:
    def countHomogenous(self, s: str) -> int:
        count = 0
        n = 1
        for i in range(1, len(s)): 
            char = s[i]
            prevChar = s[i - 1]
            if char == prevChar:
                n += 1
            else:
                count += (n*(n+1))//2 # sum of natural nums
                n = 1 
        count += (n*(n+1))//2
        return count % (10**9 + 7)