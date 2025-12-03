/**
 * Write a description of class five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nine
{
    public static void main (String [] args ){
     // 9. Keep adding user inputs until user enters 0, then display sum
        //   Padayon sa pagdugang sa mga input sa user hangtod nga ang user mosulod og 0, dayon ipakita ang sum
        int sumInputs = 0, input;
        do {
            System.out.print("Enter a number (0 to stop): ");
            input = sc.nextInt(); // Kuhaa ang integer nga gi-input sa user
            sumInputs += input; // Idugang ang input sa sum
        } while (input != 0); // Padayonon ang loop hangtod nga ang input kay 0
        System.out.println("Sum of inputs: " + sumInputs); // Ipakita ang sum

}}
