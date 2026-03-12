
import java.util.Scanner;

    public class UseCase3PalindromeCheckerApp {

        /**
         * Application entry point for UC3.
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String reversed = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }

            if (input.equals(reversed)) {
                System.out.println("Result: The string is a Palindrome.");
            } else {
                System.out.println("Result: The string is NOT a Palindrome.");
            }

            scanner.close();
        }
    }
