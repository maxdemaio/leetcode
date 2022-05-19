package string;

/**
 * @author Max DeMaio
 * Solved on 05/19/2022
 *
 * Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 * Difficulty: Medium
 *
 * Approach: Loop while x != 0
 * pop modulo 10 off the x, this gives you least significant digit
 * Update X to divide by 10 (removes last digit)
 * Update reversed num by adding pop onto it (r = r * 10 + pop)
 * Make sure we're in Integer boundaries
 *
 * Time Complexity: O(n) (length of int)
 * Space Complexity: O(1)
 *
 */

public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        int pop;

        while (x != 0) {
            // grab least significant digit
            pop = x % 10;
            // pop off least significant digit
            x /= 10;

            // check for boundaries
            // Integer.MAX_VALUE is equal 2147483647. Integer.MIN_VALUE is equal  -2147483648.
            // Last digits are 7 and 8.
            // This is the reason why we check  pop>7 and pop < -8
            if (reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop > 7) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop < -8) {
                return 0;
            }
            reversed = (reversed  * 10) + pop;
        }

        return reversed;
    }
}
