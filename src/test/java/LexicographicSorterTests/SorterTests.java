package LexicographicSorterTests;

import LexicographicSorter.Sorter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @version 1.0.0
 * @author James
 */
public class SorterTests {
    
    public SorterTests() {
    }

    @Test
    public void testExpectedSortOrder() {
	String[] testStrings = new String[] { "a", "B", "C", "d" };
	String[] expectedStrings = new String[] { "B", "C", "a", "d" };
	
	String[] res = Sorter.sort(testStrings);
	assertArrayEquals(expectedStrings, res);
    }
}
