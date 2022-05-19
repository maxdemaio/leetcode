import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import string.*;

public class StringTests {

    @Test
    void validReverseString() {
        ReverseString tester = new ReverseString();
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        tester.reverseString(input);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, input);

        input = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        tester.reverseString(input);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, input);

        input = new char[]{'H'};
        tester.reverseString(input);
        assertArrayEquals(new char[]{'H'}, input);

        input = new char[0];
        tester.reverseString(input);
        assertArrayEquals(new char[0], input);
    }

    @Test
    void validReverseInteger() {
        assertEquals(321, new ReverseInteger().reverse(123));
        assertEquals(-123, new ReverseInteger().reverse(-321));
        assertEquals(21, new ReverseInteger().reverse(120));
    }

    @Test
    void validFirstUniqueCharacterInAString() {
        assertEquals(0, new FirstUniqueCharacterInAString().firstUniqChar("leetcode"));
    }

    @Test
    void validAnagram() {
        assertFalse(new ValidAnagram().isAnagram("rat", "car"));
        assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    @Test
    void testValidPalindrome() {
        // Test for ValidPalindrome
        assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(new ValidPalindrome().isPalindrome("race a car"));
        assertFalse(new ValidPalindrome().isPalindrome("0P"));
        assertTrue(new ValidPalindrome().isPalindrome("ab@a"));
        assertTrue(new ValidPalindrome().isPalindrome(".,"));
    }
}
