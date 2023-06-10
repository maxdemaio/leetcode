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
 * Time Complexity: O(n)
 * Space Complexity: O(1) alpha fixed size of 26
 *
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // if the length doesn't equal it's not an anagram
        if (s.length() != t.length()) {
            return false;
        }

        // note: the strings we're given are all lowercase
        int[] charCounts = new int[26]; // create new array of ints size of alphabet
        for (int i = 0; i < s.length(); i++) {
            // take ascii value
            charCounts[s.charAt(i) - 'a'] += 1;
            charCounts[t.charAt(i) - 'a'] -= 1;
        }

        for (int count: charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}






