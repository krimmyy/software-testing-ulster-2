import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    @Test
    void testEven() {
        NumberUtils util = new NumberUtils();
        assertTrue(util.isEven(4)); // 4 is even
    }

    @Test
    void testOdd() {
        NumberUtils util = new NumberUtils();
        assertFalse(util.isEven(3)); // 3 is NOT even
    }
}
