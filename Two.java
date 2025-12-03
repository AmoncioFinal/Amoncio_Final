
/**
 * Write a description of class hdjcbjk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Two
{ public static void main (String [] args){
    // 2. Count how many times 7 appears in an array of 10 integers
        //   Ihapa kung pila ka beses ang numero 7 nagpakita sa usa ka array nga adunay 10 ka integers
        int[] arr = {7, 1, 7, 3, 7, 7, 8, 9, 7, 0}; // Example array
        int count = 0;
        for (int n : arr) { // Loop through each number in the array
            if (n == 7) count++; // Kung ang numero 7, dugangi ang count
        }
        System.out.println("Number of 7s: " + count); // Ipakita ang total nga ihap sa 7s

}
}