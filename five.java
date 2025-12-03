
/**
 * Write a description of class five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class five
{
    public static void main (String [] args ){
    
        // 5. Stop loop early when specific value found in array
        //   Hunonga ang loop og sayo kung makita ang usa ka piho nga value sa array
        int[] values = {1, 2, 3, 4, 5, 6}; // Example array
        int searchValue = 4;
        boolean found = false;
        for (int value : values) { // Loop through each value in the array
            if (value == searchValue) {
                found = true;
                break; // Hunonga ang loop kung makita ang value
            }
        }
        System.out.println("Value " + searchValue + " found: " + found); // Ipakita kung nakita ba ang value
}}