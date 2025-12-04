
/**
 * Write a description of class znbcjk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AverageOfOddNumbers { 
 
    public static void main(String[] args) { 
        int[] numbers = {4, 7, 2, 9, 15, 8, 3, 6, 11, 12}; 
         
        System.out.print("Array: "); 
        for (int num : numbers) { 
            System.out.print(num + " "); 
        } 
        System.out.println(); 
         
        double average = calculateAverageOfOdds(numbers); 
         
        if (Double.isNaN(average)) { 
            System.out.println("❌ No odd numbers found in the array."); 
        } else { 
            System.out.printf("✅ Average of odd numbers: %.2f%n", average); 
            System.out.println("Odd numbers found: 7, 9, 15, 3, 11"); 
        } 
    } 
     
    /** 
     * Calculates the average of all odd numbers in the array. 
     * @param arr The input integer array 
     * @return Average of odd numbers, or NaN if no odd numbers exist 
     */ 
    public static double calculateAverageOfOdds(int[] arr) { 
        if (arr == null || arr.length == 0) { 
            return Double.NaN; 
        } 
         
        int sumOfOdds = 0; 
        int countOfOdds = 0; 
         
        // Single pass: find odd numbers, sum them, and count them 
        for (int number : arr) { 
            if (number % 2 != 0) {  // Check if odd 
                sumOfOdds += number; 
                countOfOdds++; 
            } 
        } 
         
        // Return average or NaN if no odds found 
        return countOfOdds > 0 ? (double) sumOfOdds / countOfOdds : Double.NaN; 
    } 
} 