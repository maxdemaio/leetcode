'''

Approach/Notes:

Need the delimiter because something can be length 10,
you'd need to know where the string starts

Time complexity:
O(n) for each letter in the resulting string

Space complexity:
O(1) no data structures used

'''


class Codec:
    def encode(self, strs):
        res = ""
        for s in strs:
            res += str(len(s)) + "#" + s
        return res

    def decode(self, s):
        # res array, helper pointer
        res = []
        i = 0

        # iterate over each character in the encoded string
        while i < len(s):
            # start to construct each string for the array
            j = i
            while s[j] != '#':
                j += 1
            # get the length from the integer before the delimiter '10#mystringher'
            length = int(s[i:j])
            # set up the OG pointer to be right at beginning of the string
            i = j + 1
            # set up the J pointer to be right at end of the string
            j = i + length
            # add the string
            res.append(s[i:j])
            # put original pointer where J was so we can start to look for 10# again
            i = j

        return res
