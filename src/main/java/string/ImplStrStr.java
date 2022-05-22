package string;

/**
 * @author Max DeMaio
 * Solved on 05/22/2022
 *
 * Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 * Difficulty: Easy
 *
 * Approach: Compare pattern with every substring in the original string
 * if the first char matches
 *
 * Time Complexity: If m denotes to the length of haystack and n denotes to the length of needle,
 * it will take O(mn) time for double for-loop.
 *
 * Space Complexity: O(1)
 *
 */

public class ImplStrStr {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length() > haystack.length())
            return -1;
        if (needle.length() == 0)
            return 0;

        // shouldn't stop if we can't form the needle out of the haystack
        // ex) "helloo" (6) and "ll" (2)
        // we should stop after the 'o' bc no longer can form the needle
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            // are chars the same
            if (haystack.charAt(i) == needle.charAt(0)) {
                // are next chars the same?
                // check substring from that starting point
                if(haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
