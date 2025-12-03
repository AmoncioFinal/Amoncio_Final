/**
 * Write a description of class five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class eight
{
    public static void main (String [] args ){
        // 8. Copy all elements from Array A into Array B
        //   Kopyaha ang tanan nga mga elemento gikan sa Array A ngadto sa Array B
        int[] A = {10, 20, 30, 40, 50}; // Example array A
        int[] B = new int[A.length]; // Paghimo og bag-o nga array B nga pareho og gidak-on sa A
        for (int i = 0; i < A.length; i++) { // Loop through each element in array A
            B[i] = A[i]; // Kopyaha ang elemento gikan sa A ngadto sa B
        }
        System.out.println("Array B: " + Arrays.toString(B)); // Ipakita ang array B

        
}}