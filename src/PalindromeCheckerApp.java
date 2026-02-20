// UseCase3PalindromeCheckerApp.java

import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input the string
        System.out.print("Enter a string to check: ");
        String original = sc.nextLine();

        // We normalize the string (remove spaces and lowercase) for a better check
        String cleaned = original.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        // 2. Reverse string using a loop
        // We start from the last index (length - 1) and move to 0
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i); // String concatenation
        }

        // 3. Compare original and reversed using .equals()
        System.out.println("Original: " + cleaned);
        System.out.println("Reversed: " + reversed);

        if (cleaned.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        sc.close();
    }
}