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
        // Given
        int actual = new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});

        // Then
        assertEquals(5, actual);
    }

    @Test
    void validBestTimeToBuyAndSellStockIi() {
        assertEquals(new BestTimeToBuyAndSellStockIi().maxProfit(new int[] {7,6,4,3,1}), 0);
        assertEquals(new BestTimeToBuyAndSellStockIi().maxProfit(new int[] {1,2,3,4,5}), 4);
        assertEquals(new BestTimeToBuyAndSellStockIi().maxProfit(new int[] {7,1,5,3,6,4}), 7);
    }

    @Test
    void validRotateArray() {
        // mem version
        int[] actual = new RotateArray().rotateWithMem(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
        int[] expected = new int[] { 5, 6, 7, 1, 2, 3, 4 };
        assertArrayEquals(expected, actual);

        // O(1) version
        actual = new int[] { -1, -100, 3, 99 };
        new RotateArray().rotate(actual, 2);
        expected = new int[] { 3, 99, -1, -100 };
        assertArrayEquals(expected, actual);

        actual = new int[] { -1, -100, 3, 99 };
        new RotateArray().rotate(actual, 5);
        expected = new int[] { 99, -1, -100, 3 };
        assertArrayEquals(expected, actual);
    }

    @Test
    void validContainsDuplicate() {
        assertEquals(new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,1}), true);
        assertEquals(new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,4}), false);
    }

    @Test
    void validSingleNumber() {
        assertEquals(new SingleNumber().singleNumber(new int[] {2,2,1}), 1);
        assertEquals(new SingleNumber().singleNumberMem(new int[] {4,1,2,1,2}), 4);

    }
}
