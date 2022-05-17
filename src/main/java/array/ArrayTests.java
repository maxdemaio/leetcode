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
}
