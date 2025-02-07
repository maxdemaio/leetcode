from arrays.groupanagrams import Solution

def test_groupAnagrams():
    solution = Solution()
    input1 = ["act", "pots", "tops", "cat", "stop", "hat"]
    output1 = [["hat"], ["act", "cat"], ["stop", "pots", "tops"]]

    solution.groupAnagrams(input1)

    input2 = ["bdddddddddd","bbbbbbbbbbc"]
    output2 = [["bdddddddddd"],["bbbbbbbbbbc"]]
    solution.groupAnagrams(input2)
