
/**
 * Write a description of class jhgdjcgdjk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountSevenInArray { 
 
    public static void main(String[] args) { 
        // Define an array of 10 integers 
        int[] numbers = {1, 7, 3, 7, 5, 6, 7, 8, 9, 7}; 
         
        // Initialize a counter for the number 7 
        int countOfSevens = 0; 
         
        // Iterate through each element in the array 
        for (int i = 0; i < numbers.length; i++) { 
            // Check if the current element is equal to 7 
            if (numbers[i] == 7) { 
                countOfSevens++; // If it is, increment the counter 
            } 
        } 
         
        // Print the result 
        System.out.println("The number 7 appears " + countOfSevens + " times in the array."); 
 
        // --- Example with a different array --- 
        int[] anotherNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
        int anotherCount = countOccurrences(anotherNumbers, 7); 
        System.out.println("In the second array, the number 7 appears " + anotherCount + " times."); 
 
        // --- Example with another array where 7 appears multiple times --- 
        int[] yetAnotherNumbers = {7, 17, 7, 27, 7, 37, 7, 47, 7, 57}; 
        int yetAnotherCount = countOccurrences(yetAnotherNumbers, 7); 
        System.out.println("In the third array, the number 7 appears " + yetAnotherCount + " times."); 
    } 
 
    /** 
     * A reusable method to count occurrences of a target number in an integer array. 
     * @param arr The integer array to search within. 
     * @param target The number to count. 
     * @return The number of times the target appears in the array. 
     */ 
    public static int countOccurrences(int[] arr, int target) { 
        int count = 0; 
        for (int number : arr) { // Enhanced for-loop for readability 
            if (number == target) { 
                count++; 
            } 
        } 
        return count; 
    } 
} 