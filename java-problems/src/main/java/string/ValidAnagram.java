package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Max DeMaio
 * Solved on XX/XX/XXXX
 *
 * Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 * Difficulty: Easy
 *
 * Approach: Make an int array for letters of alphabet
 * increment for frequency of first string, decrement for other
 * sum of int array should be 0 if anagram
 *
 * Time Complexity: O(1) alpha fixed size of 26
 * Space Complexity: O(n)
 *
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a'] += 1;
            charCounts[t.charAt(i) - 'a'] -= 1;
        }

// If sum is 0, return true
        for (int count: charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
