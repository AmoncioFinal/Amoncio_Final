
/**
 * Write a description of class four here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class four
{ public static void main (String [] args){
   // 4. Find smallest and largest number in array in a single loop
        //   Pangitaa ang pinakagamay ug pinakadako nga numero sa array sa usa lang ka loop
        int[] numbers = {5, 2, 9, 1, 5, 6}; // Example array
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) { // Loop through each number in the array
            if (number < min) min = number; // Kung ang numero mas gamay sa kasamtangan nga minimum, ilisan ang minimum
            if (number > max) max = number; // Kung ang numero mas dako sa kasamtangan nga maximum, ilisan ang maximum
        }
        System.out.println("Smallest: " + min + ", Largest: " + max); // Ipakita ang pinakagamay ug pinakadako nga numero

}}