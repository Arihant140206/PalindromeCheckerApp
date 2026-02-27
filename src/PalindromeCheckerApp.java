import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Algorithm 1: Two-Pointer Approach
        long startTime = System.nanoTime();
        boolean result1 = twoPointerPalindrome(normalized);
        long endTime = System.nanoTime();
        long timeTwoPointer = endTime - startTime;

        // Algorithm 2: Stack-Based Approach
        startTime = System.nanoTime();
        boolean result2 = stackPalindrome(normalized);
        endTime = System.nanoTime();
        long timeStack = endTime - startTime;

        // Algorithm 3: Deque-Based Approach
        startTime = System.nanoTime();
        boolean result3 = dequePalindrome(normalized);
        endTime = System.nanoTime();
        long timeDeque = endTime - startTime;

        // Display results
        System.out.println("\nPalindrome Results:");
        System.out.println("Two-Pointer Result: " + result1);
        System.out.println("Stack Result      : " + result2);
        System.out.println("Deque Result      : " + result3);

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Two-Pointer: " + timeTwoPointer);
        System.out.println("Stack      : " + timeStack);
        System.out.println("Deque      : " + timeDeque);

        scanner.close();
    }

    // Algorithm 1: Two-Pointer
    private static boolean twoPointerPalindrome(String str) {
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

    // Algorithm 2: Stack using array
    private static boolean stackPalindrome(String str) {
        char[] stack = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            stack[++top] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack[top--]) {
                return false;
            }
        }
        return true;
    }

    // Algorithm 3: Deque
    private static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}