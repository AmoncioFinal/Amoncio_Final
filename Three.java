
/**
 * Write a description of class ndkh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Three
{ public static void main(String [] args){
// 3. Display triangle pattern of stars (1 to 5 stars)
        //   Ipakita ang triangle nga pattern sa mga bitoon (1 hangtod 5 ka bitoon)
        for (int i = 1; i <= 5; i++) { // Loop para sa matag linya
            for (int j = 1; j <= i; j++) { // Loop para sa pag-print sa mga bitoon sa matag linya
                System.out.print("*");
            }
            System.out.println(); // Pagbalhin sa sunod nga linya
        }
   
}}