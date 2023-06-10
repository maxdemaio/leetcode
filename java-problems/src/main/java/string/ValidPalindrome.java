package string;

/**
 * @author Max DeMaio
 * Solved on 05/19/2022
 *
 * Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/
 * Difficulty: Easy
 *
 * Approach: Two pointers, ignore non-alphanumeric,
 * increment i and decrement j
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            Character rChar = Character.toLowerCase(s.charAt(i));
            Character lChar = Character.toLowerCase(s.charAt(j));

            // Check if alphanumeric
            if (!Character.isLetterOrDigit(rChar)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(lChar)) {
                j--;
                continue;
            }

            if (rChar != lChar) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
