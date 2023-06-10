import static org.junit.jupiter.api.Assertions.*;

import array.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayTests {
    @Test
    void validTwoSum() {
        assertEquals(1, Arrays.stream(new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 9)).sum());
        assertEquals(1, Arrays.stream(new TwoSum().twoSum(new int[] { 4, 7 }, 11)).sum());
        assertEquals(1, Arrays.stream(new TwoSum().twoSum(new int[] { -1, 1 }, 0)).sum());
        assertEquals(1, Arrays.stream(new TwoSum().twoSum(new int[] { 2, -7 }, -5)).sum());
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
    void validRotateImage() {
        int[][] actual = new RotateImage().rotateWithMem(new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
        int[][] expected = new int[][] {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
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

    @Test
    void testIntersectionOfTwoArraysII() {
        assertArrayEquals(new int[]{2, 2}, new IntersectionOfTwoArraysIi().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, new IntersectionOfTwoArraysIi().intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
        assertArrayEquals(new int[]{1, 2}, new IntersectionOfTwoArraysIi().intersect(new int[]{2, 1}, new int[]{1, 2}));
    }
}
