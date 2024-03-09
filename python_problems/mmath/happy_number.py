"""

if we have visited the number before than it's in a cycle and it's jover
otherwise continue until you're able to hit 1

"""

class Solution:
    def isHappyNaive(self, n: int) -> bool:
        visited = {}

        curr = str(n)
        while True:
            sol = 0
            for i in range(len(curr)):
                sol += int(curr[i])**2
            if sol in visited:
                return False
            elif sol == 1:
                return True
            curr = str(sol)
            visited[sol] = 1
