/**
 * Write a description of class five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seven
{
    public static void main (String [] args ){
        // 7. Convert all negative numbers in an array to positive
        //   I-convert ang tanan nga mga negative nga numero sa array ngadto sa positive
        int[] negativeNumbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5}; // Example array
        for (int i = 0; i < negativeNumbers.length; i++) { // Loop through each number in the array
            if (negativeNumbers[i] < 0) {
                negativeNumbers[i] = -negativeNumbers[i]; // Kung ang numero kay negative, i-convert ngadto sa positive
            }
        }
        System.out.println("Converted array: " + Arrays.toString(negativeNumbers)); // Ipakita ang gi-convert nga array

           
}}