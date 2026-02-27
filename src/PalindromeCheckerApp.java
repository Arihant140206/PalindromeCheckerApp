import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();


        String normalized = input.replaceAll("\\s+", "").toLowerCase();


        boolean isPalindrome = checkPalindrome(normalized);


        if (isPalindrome) {
            System.out.println("The given string IS a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string is NOT a palindrome (ignoring case and spaces).");
        }

        scanner.close();
    }


    private static boolean checkPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}