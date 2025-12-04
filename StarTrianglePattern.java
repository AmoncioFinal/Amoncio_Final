
/**
 * Write a description of class bdfbb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StarTrianglePattern { 
 
    public static void main(String[] args) { 
        int numberOfLines = 5; // You can change this to any desired number of lines 
 
        System.out.println("Right-aligned Triangle Pattern:"); 
        // Outer loop for rows 
        for (int i = 1; i <= numberOfLines; i++) { 
            // Inner loop for printing spaces (to make it right-aligned) 
            for (int j = 1; j <= numberOfLines - i; j++) { 
                System.out.print(" "); 
            } 
            // Inner loop for printing stars 
            for (int k = 1; k <= i; k++) { 
                System.out.print("*"); 
            } 
            System.out.println(); // Move to the next line after each row 
        } 
 
        System.out.println("\nLeft-aligned Triangle Pattern:"); 
        // Outer loop for rows 
        for (int i = 1; i <= numberOfLines; i++) { 
            // Inner loop for printing stars 
            for (int j = 1; j <= i; j++) { 
                System.out.print("*"); 
            } 
            System.out.println(); // Move to the next line after each row 
        } 
    } 
} 