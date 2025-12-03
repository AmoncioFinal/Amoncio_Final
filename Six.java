/**
 * Write a description of class five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Six
{
    public static void main (String [] args ){
      // 6. Compute average of all odd numbers stored in an array
        //   Kuhaa ang average sa tanan nga mga odd nga numero nga gitipigan sa array
        int[] oddNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Example array
        int sum = 0, countOdd = 0;
        for (int oddNumber : oddNumbers) { // Loop through each number in the array
            if (oddNumber % 2 != 0) { // Kung ang numero kay odd
                sum += oddNumber; // Idugang ang numero sa sum
                countOdd++; // Dugangi ang ihap sa mga odd nga numero
            }
        }
        double average = (countOdd > 0) ? (double) sum / countOdd : 0; // Kuhaa ang average
        System.out.println("Average of odd numbers: " + average); // Ipakita ang average

        
}}