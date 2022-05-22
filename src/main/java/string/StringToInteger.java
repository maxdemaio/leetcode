package string;

/**
 * @author Max DeMaio
 * Solved on 05/22/2022
 *
 * String to Integer (atoi)
 * https://leetcode.com/problems/string-to-integer-atoi/
 * Difficulty: Medium
 *
 * Approach: Skip over whitespace and increment pointer
 * if +/- change sign variable for end result
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 */

public class StringToInteger {
    public int myAtoi(String s) {
        if (s.equals("")) {
            return 0;
        }

        // helper vars
        int res = 0, i = 0, sign = 1;

        // skip over whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // check for sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            // change if negative and if positive we just increment i
            if (s.charAt(i++) == '-') {
                sign = -1;
            }
        }

        // iterate across digits if any
        // should only be in range 0-9
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            // check if we go over max or min
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            res = res * 10 + (s.charAt(i++) - '0');
        }

        return sign * res;
    }
}
