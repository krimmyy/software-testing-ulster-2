import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    void testPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    void testNotPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"));
    }
}
