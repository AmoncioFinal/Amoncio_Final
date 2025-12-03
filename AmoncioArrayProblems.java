/**
 * Write a description of class FINALoutput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AmoncioArrayProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Repeatedly ask user for a number between 1 and 100
        //   Pangutan-a ang user balik-balik hangtod makasulod sila og numero nga between 1 ug 100
        int num;
        do {
            System.out.print("Enter a number between 1 and 100: ");
            num = sc.nextInt(); // Kuhaa ang integer nga gi-input sa user
        } while (num < 1 || num > 100); // Padayonon ang loop hangtod nga ang numero naa sa sakto nga range
        System.out.println("Valid number: " + num); // Ipakita ang balido nga numero

        // 2. Count how many times 7 appears in an array of 10 integers
        //   Ihapa kung pila ka beses ang numero 7 nagpakita sa usa ka array nga adunay 10 ka integers
        int[] arr = {7, 1, 7, 3, 7, 7, 8, 9, 7, 0}; // Example array
        int count = 0;
        for (int n : arr) { // Loop through each number in the array
            if (n == 7) count++; // Kung ang numero 7, dugangi ang count
        }
        System.out.println("Number of 7s: " + count); // Ipakita ang total nga ihap sa 7s

        // 3. Display triangle pattern of stars (1 to 5 stars)
        //   Ipakita ang triangle nga pattern sa mga bitoon (1 hangtod 5 ka bitoon)
        for (int i = 1; i <= 5; i++) { // Loop para sa matag linya
            for (int j = 1; j <= i; j++) { // Loop para sa pag-print sa mga bitoon sa matag linya
                System.out.print("*");
            }
            System.out.println(); // Pagbalhin sa sunod nga linya
        }

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

        // 7. Convert all negative numbers in an array to positive
        //   I-convert ang tanan nga mga negative nga numero sa array ngadto sa positive
        int[] negativeNumbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5}; // Example array
        for (int i = 0; i < negativeNumbers.length; i++) { // Loop through each number in the array
            if (negativeNumbers[i] < 0) {
                negativeNumbers[i] = -negativeNumbers[i]; // Kung ang numero kay negative, i-convert ngadto sa positive
            }
        }
        System.out.println("Converted array: " + Arrays.toString(negativeNumbers)); // Ipakita ang gi-convert nga array

        // 8. Copy all elements from Array A into Array B
        //   Kopyaha ang tanan nga mga elemento gikan sa Array A ngadto sa Array B
        int[] A = {10, 20, 30, 40, 50}; // Example array A
        int[] B = new int[A.length]; // Paghimo og bag-o nga array B nga pareho og gidak-on sa A
        for (int i = 0; i < A.length; i++) { // Loop through each element in array A
            B[i] = A[i]; // Kopyaha ang elemento gikan sa A ngadto sa B
        }
        System.out.println("Array B: " + Arrays.toString(B)); // Ipakita ang array B

        // 9. Keep adding user inputs until user enters 0, then display sum
        //   Padayon sa pagdugang sa mga input sa user hangtod nga ang user mosulod og 0, dayon ipakita ang sum
        int sumInputs = 0, input;
        do {
            System.out.print("Enter a number (0 to stop): ");
            input = sc.nextInt(); // Kuhaa ang integer nga gi-input sa user
            sumInputs += input; // Idugang ang input sa sum
        } while (input != 0); // Padayonon ang loop hangtod nga ang input kay 0
        System.out.println("Sum of inputs: " + sumInputs); // Ipakita ang sum

        // 10. Find index of first even number in array
        //    Pangitaa ang index sa unang even nga numero sa array
        int[] evenArray = {1, 3, 5, 2, 7, 8, 9};
        int firstEvenIndex = -1;
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }
        System.out.println("Index of first even number: " + firstEvenIndex);

        // 11. Display only even-index elements of an array (0, 2, 4, ...)
        //    Ipakita lang ang even-index nga mga elemento sa array (0, 2, 4, ...)
        int[] indexArray = {10, 11, 12, 13, 14, 15};
        System.out.print("Even-index elements: ");
        for (int i = 0; i < indexArray.length; i += 2) {
            System.out.print(indexArray[i] + " ");
        }
        System.out.println();

        // 12. Check if a specific value appears at least 3 times in array
        //    Susiha kung ang usa ka piho nga value nagpakita ba labing menos 3 ka beses sa array
        int[] checkArray = {5, 6, 5, 7, 5, 8};
        int checkValue = 5;
        int checkCount = 0;
        for (int value : checkArray) {
            if (value == checkValue) {
                checkCount++;
            }
        }
        boolean appearsAtLeast3 = checkCount >= 3;
        System.out.println("Value " + checkValue + " appears at least 3 times: " + appearsAtLeast3);

        // 13. Find number of students who passed (≥75) and failed (<75)
        //    Pangitaa ang gidaghanon sa mga estudyante nga nakapasar (≥75) ug napakyas (<75)
        int[] grades = {70, 80, 90, 60, 75, 85};
        int passCount = 0, failCount = 0;
        for (int grade : grades) {
            if (grade >= 75) {
                passCount++;
            } else {
                failCount++;
            }
        }
        System.out.println("Passed: " + passCount + ", Failed: " + failCount);

        // 14. Print elements of array in reverse order
        //    I-print ang mga elemento sa array sa reverse order
        int[] reverseArray = {1, 2, 3, 4, 5};
        System.out.print("Reversed array: ");
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();

        // 15. Ask user for 5 numbers, store in array, display numbers > 50
        //    Pangutan-a ang user alang sa 5 ka numero, tipigi sa array, ipakita ang mga numero nga > 50
        int[] greaterThanArray = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            greaterThanArray[i] = sc.nextInt();
        }
        System.out.print("Numbers greater than 50: ");
        for (int number : greaterThanArray) {
            if (number > 50) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        // 16. Count how many digits are in a number input by user
        //    Ihapa kung pila ka digit ang naa sa numero nga gi-input sa user
        System.out.print("Enter a number: ");
        int digitNumber = sc.nextInt();
        int digitCount = String.valueOf(Math.abs(digitNumber)).length();
        System.out.println("Number of digits: " + digitCount);

        // 17. Compute second highest number in array without sorting
        //    Kuhaa ang ikaduha nga labing taas nga numero sa array nga dili mag-sort
        int[] secondHighestArray = {6, 8, 2, 6, 1, 5};
        int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;
        for (int number : secondHighestArray) {
            if (number > highest) {
                secondHighest = highest;
                highest = number;
            } else if (number > secondHighest && number != highest) {
                secondHighest = number;
            }
        }
        System.out.println("Second highest number: " + secondHighest);

        // 18. Determine if array contains duplicate values
        //    Tinoa kung ang array adunay duplicate nga mga value
        int[] duplicateArray = {1, 2, 3, 4, 2, 5};
        Set<Integer> uniqueValues = new HashSet<>();
        boolean hasDuplicate = false;
        for (int number : duplicateArray) {
            if (!uniqueValues.add(number)) {
                hasDuplicate = true;
                break;
            }
        }
        System.out.println("Has duplicates: " + hasDuplicate);

        // 19. Match student names to grades stored in another array
        //    Ipares ang mga ngalan sa estudyante sa mga grado nga gitipigan sa lain nga array
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        int[] studentGrades = {85, 90, 78};
        System.out.println("Student Grades:");
        for (int i = 0; i < Math.min(studentNames.length, studentGrades.length); i++) {
            System.out.println(studentNames[i] + ": " + studentGrades[i]);
        }

        // 20. Print only even numbers greater than 20 in array
        //    I-print lang ang mga even nga numero nga labaw sa 20 sa array
        int[] evenGreaterArray = {22, 18, 24, 30, 16, 28};
        System.out.print("Even numbers greater than 20: ");
        for (int number : evenGreaterArray) {
            if (number > 20 && number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}