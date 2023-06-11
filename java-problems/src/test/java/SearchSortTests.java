import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import searchSort.BinarySearch;

public class SearchSortTests {

    @Test
    void validBinarySearch() {
        assertEquals(4, new BinarySearch().search(new int[] {-1,0,3,5,9,12}, 9));
        assertEquals(-1, new BinarySearch().search(new int[] {-1,0,3,5,9,12}, 2));
    }
}
