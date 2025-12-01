
/**
 * Write a description of class sdafgth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class InputValidationExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        
        System.out.println("--- Number Input Validator ---");

        do {
            System.out.print("Please enter a number between 1 and 100: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. That is not a valid integer. Please try again.");
                scanner.next();
                System.out.print("Please enter a number between 1 and 100: ");
            }
            
            userInput = scanner.nextInt();

            if (userInput < 1 || userInput > 100) {
                System.out.println("The number " + userInput + " is outside the valid range. Please try again.");
            }

        } while (userInput < 1 || userInput > 100);

        System.out.println("\nSuccess! You entered a valid number: " + userInput);
        
        scanner.close();
    }
}
