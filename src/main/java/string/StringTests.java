package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTests {

    @Test
    void validReverseString() {
        ReverseString tester = new ReverseString();
        char[] input = new char[] { 'h', 'e', 'l', 'l', 'o' };
        tester.reverseString(input);
        assertArrayEquals(new char[] { 'o', 'l', 'l', 'e', 'h' }, input);

        input = new char[] { 'H', 'a', 'n', 'n', 'a', 'h' };
        tester.reverseString(input);
        assertArrayEquals(new char[] { 'h', 'a', 'n', 'n', 'a', 'H' }, input);

        input = new char[] { 'H' };
        tester.reverseString(input);
        assertArrayEquals(new char[] { 'H' }, input);

        input = new char[0];
        tester.reverseString(input);
        assertArrayEquals(new char[0], input);
    }
}
