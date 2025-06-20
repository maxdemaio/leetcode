from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        freqmaps = {}

        for s in strs:
            key = [0] * 26  # Frequency array for each character
            for c in s:
                key[ord(c) - ord('a')] += 1  # Count occurrences

            key_tuple = tuple(key)  # Convert list to tuple for hashing

            if key_tuple in freqmaps:
                freqmaps[key_tuple].append(s)
            else:
                freqmaps[key_tuple] = [s]  # Initialize new group

        return list(freqmaps.values())  # Extract grouped anagrams
