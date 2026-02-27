import java.util.Scanner;

class PalindromeChecker {


    public boolean checkPalindrome(String input) {


        String normalized = input.replaceAll("\\s+", "").toLowerCase();


        char[] stack = new char[normalized.length()];
        int top = -1;

        // Push characters onto stack
        for (int i = 0; i < normalized.length(); i++) {
            stack[++top] = normalized.charAt(i);
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack[top--]) {
                return false;
            }
        }

        return true;
    }
}


public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        // Invoke service method
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string IS a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}