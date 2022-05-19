package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Max DeMaio
 * Solved on 05/19/2022
 *
 * First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * Difficulty: Easy
 *
 * Approach: Build hashmap w/ frequency
 * Iterate over string again and check for frequency of 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) memory bc alphabet only has 26 characters (max length of hashmap)
 *
 */

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> myMap = new HashMap();

        // Populate frequency map
        for (int i = 0; i < s.length(); i++) {
            if (myMap.containsKey(s.charAt(i))) {
                // update count if duplicates
                myMap.put(s.charAt(i), myMap.get(s.charAt(i)) + 1);

            } else {
                // Start at 1 if non-existant
                myMap.put(s.charAt(i), 1);
            }
        }

        // Check for index of first unique char
        for (int i = 0; i < s.length(); i++) {
            if (myMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
