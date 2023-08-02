import static org.junit.jupiter.api.Assertions.*;

import bitManipulation.SumOfTwoIntegers;
import org.junit.jupiter.api.Test;

public class BitManipulationTests {

    @Test
    void testSumOfTwoIntegers() {
        assertEquals(-1, new SumOfTwoIntegers().getSum(-2, 1));
        assertEquals(0, new SumOfTwoIntegers().getSum(-1, 1));
        assertEquals(4, new SumOfTwoIntegers().getSum(2, 2));
        assertEquals(3, new SumOfTwoIntegers().getSum(1, 2));
    }
}
