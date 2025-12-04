
/**
 * Write a description of class jsgjkjukjkv here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MinMaxInSingleLoop { 
    
    public static void main(String[] args) { 
        // Test array 
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 5, 7, 45}; 
         
        System.out.print("Array: "); 
        for (int num : numbers) { 
            System.out.print(num + " "); 
        } 
        System.out.println(); 
         
        // Find min and max in single loop 
        int[] result = findMinMax(numbers); 
        System.out.println("Smallest number: " + result[0]); 
        System.out.println("Largest number: " + result[1]); 
    } 
     
    /** 
     * Finds both minimum and maximum in a single pass through the array. 
     * @param arr The input integer array (must not be empty) 
     * @return An array where index 0 = min, index 1 = max 
     */ 
    public static int[] findMinMax(int[] arr) { 
        if (arr == null || arr.length == 0) { 
            return new int[]{-1, -1}; // Error case 
        } 
         
        // Initialize min and max with the first element 
        int min = arr[0]; 
        int max = arr[0]; 
         
        // Single loop: compare each element with both min and max 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] < min) { 
                min = arr[i];  // Update min if current element is smaller 
            } 
            if (arr[i] > max) { 
                max = arr[i];  // Update max if current element is larger 
            } 
        } 
         
        return new int[]{min, max}; 
    } 
} 