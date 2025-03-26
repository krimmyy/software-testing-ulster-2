public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
