
/**
 * Write a description of class jkdbcjkv here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EarlyLoopExit { 
 
    public static void main(String[] args) { 
        int[] numbers = {14, 23, 7, 45, 67, 8, 9, 12, 7, 34}; 
        int target = 7; 
         
        System.out.print("Array: "); 
        for (int num : numbers) { 
            System.out.print(num + " "); 
        } 
        System.out.println("\nTarget: " + target); 
         
        // Search for target and stop when found 
        int position = searchAndStop(numbers, target); 
        if (position != -1) { 
            System.out.println("✅ Found " + target + " at position " + position + " (0-based index)"); 
        } else { 
            System.out.println("❌ Target " + target + " not found"); 
        } 
    } 
     
    /** 
     * Searches for target value and stops loop immediately when found. 
     * @param arr The array to search 
     * @param target The value to find 
     * @return Index of first occurrence, or -1 if not found 
     */ 
    public static int searchAndStop(int[] arr, int target) { 
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == target) { 
                return i;  // Found it! Return index and exit method (stops loop) 
            } 
            // Optional: Show progress 
            System.out.print("Checking " + arr[i] + "... "); 
        } 
        return -1;  // Not found after checking all elements 
    } 
} 