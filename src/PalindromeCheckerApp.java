// UseCase1PalindromeCheckerApp.java

// UseCase3PalindromeCheckerApp.java

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "racecar";  // hardcoded string to check
        String reversed = "";

        // Reverse the string using a for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i); // concatenate characters in reverse
        }

        // Compare original and reversed strings
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}