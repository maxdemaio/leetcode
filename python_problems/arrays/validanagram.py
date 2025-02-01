class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        freqmap_s, freqmap_t = {}, {}

        for i in range(0, len(s)):
            freqmap_s[s[i]] = freqmap_s.get(s[i], 0) + 1
            freqmap_t[t[i]] = freqmap_t.get(t[i], 0) + 1

        for char in freqmap_s:
            if freqmap_s[char] != freqmap_t.get(char, 0):
                return False
        return True
