import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (Character Array Version) ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Step 1: Convert string to char array
        char[] charArray = input.toLowerCase().toCharArray();

        // Step 2: Check if it's a palindrome using Two-Pointer Technique
        boolean isPalindrome = checkPalindrome(charArray);

        // Output result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(char[] arr) {
        // Initialize two pointers
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Compare characters at both ends
            if (arr[start] != arr[end]) {
                return false; // Not a palindrome
            }
            // Move pointers towards the center
            start++;
            end--;
        }
        return true; // If loop finishes, it is a palindrome
    }
}