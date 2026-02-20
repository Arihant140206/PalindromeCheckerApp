// UseCase1PalindromeCheckerApp.java

// UseCase2PalindromeCheckerApp.java

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "madam";  // hardcoded string to check

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}