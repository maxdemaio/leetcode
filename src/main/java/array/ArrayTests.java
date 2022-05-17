package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayTests {
    @Test
    void validTwoSum() {
        assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 9));
        assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(new int[] { 4, 7 }, 11));
        assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(new int[] { -1, 1 }, 0));
        assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(new int[] { 2, -7 }, -5));
    }

    @Test
    void validRemoveDuplicatesFromSortedArray() {
        return;
    }
}
