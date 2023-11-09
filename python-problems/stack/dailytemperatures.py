class Solution:
    # note: monotonic increasing stack
    # https://leetcode.com/problems/daily-temperatures/solutions/3885602/python-easy-solution-100-beats-98/
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        ans = []
        for i in range(0, len(temperatures)):
            count = 0
            found = False
            for j in range(i + 1, len(temperatures)):
                count += 1
                # found day with greater temp
                if temperatures[j] > temperatures[i]:
                    found = True
                    break
            # no greater temp found
            if found == False:
                count = 0
            ans.append(count)
        return ans
