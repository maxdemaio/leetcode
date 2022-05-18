package string;

/**
 * @author Max DeMaio
 * Solved on XX/XX/XXXX
 *
 * Reverse String
 * https://leetcode.com/problems/reverse-string/
 * Difficulty: Easy
 *
 * Approach: Two pointers, increment/decrement inwards
 * until equal and swap with temp variable
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @see StringTests#validReverseString()
 */

public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
