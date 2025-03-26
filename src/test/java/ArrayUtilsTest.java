import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {
    @Test
    void testFindMax() {
        ArrayUtils util = new ArrayUtils();
        assertEquals(9, util.findMax(new int[]{1, 3, 9, 2}));
    }
}
