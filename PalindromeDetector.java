package src.main.java.ua.goit.Module7;

public class PalindromeDetector {

    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder reversed = new StringBuilder();
            reversed.append(word).reverse();
            return reversed.toString();
    }
}

class PalindromeDetectorTest {
    public static void main(String[] args) {
        System.out.println(new PalindromeDetector().isPalindrome("Java"));
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }
}