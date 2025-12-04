
/**
 * Write a description of class ArrayProblemNum_one here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    import java.util.Scanner; 
public class NumberInputValidator { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int userInput = 0; 
        boolean isValid = false; 
 
        // Loop indefinitely until valid input is provided 
        while (!isValid) { 
            System.out.print("Please enter a number between 1 and 100: "); 
             
            // Check if the input is an integer 
            if (scanner.hasNextInt()) { 
                userInput = scanner.nextInt(); 
                 
                // Validate if the number is within the desired range 
                if (userInput >= 1 && userInput <= 100) { 
                    isValid = true; // Input is valid, exit the loop 
                    System.out.println("Thank you! You entered: " + userInput); 
                } else { 
                    System.out.println("The number you entered is " + userInput + ". That's not between 1 and 100. Please try again."); 
                } 
            } else { 
                // Handle non-integer input 
                System.out.println("Invalid input. Please enter a whole number."); 
                scanner.next(); // Consume the invalid input to prevent an infinite loop 
            } 
        } 
         
        scanner.close(); // Close the scanner to release resources 
    } 
} 