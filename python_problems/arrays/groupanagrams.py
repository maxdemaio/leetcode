from typing import *


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        freqmaps = {}
        output = []
        output_index = -1
        for s in strs:
            key = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
            for char in s:
                index = ord(char) - 97
                key[index] += 1
            key_string = ",".join(map(str, key))
            if key_string in freqmaps:
                output[freqmaps[key_string]].append(s)
            else:
                output_index += 1
                freqmaps[key_string] = output_index
                output.append([])
                output[output_index].append(s)
        return output
