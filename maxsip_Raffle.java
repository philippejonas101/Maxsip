package Maxsip;

import java.awt.*;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;


//The purpose of this code is to act as a raffle to reward our customers at Maxsip Telecom for their Services
public class maxsip_Raffle {
    public static void main(String[] args) throws InterruptedException {
        String maxSip;
        int[] numbers = new int[7];
        int sum;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter maxsip
        System.out.println("Please enter our key code 'Maxsip': ");
        maxSip = scanner.nextLine();
             /*Here I am creating a sleep method that allows the program that allows the program to wait 2 seconds
        before executing the scanner method
         */
        Thread.sleep(2000);
            /*Here I am creating a print statement that instructs the user that they have just entered
            a raffle for a chance to win a free tablet.
             */
        System.out.println("Welcome to a chance to win the Raffle at Maxsip telecom!");
        System.out.println("You may win a free tablet!");
        // Here I am using a for loop to iterate and generate 7 random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
               /*Here I am also creating a sleep method that allows the program that allows the program to wait 2 seconds
        before executing the scanner method
         */
        Thread.sleep(2000);

        // Here I am using a for loop iterate and print out the numbers
        System.out.println("Your raffle number ticket is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "");
        }

        // Here I am using a for loop to iterate the 7 numbers and calculate the sum of the 7 numbers
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
               /*Here I am also creating a sleep method that allows the program that allows the program to wait 2 seconds
        before executing the scanner method
         */
        Thread.sleep(2000);

            /* Here I am using an If-Else statement to check if the sum of the seven numbers is even or odd
            if The sum is odd the program will let the user know they have won. If the
            sum is even, the program will let the user know they have lost.
             */
        if (sum % 2 == 0) {
            System.out.println("\nSorry " + maxSip + ", you have not won the raffle.");
        } else {
            System.out.println("\nCongratulations " + maxSip + ", you have won the raffle!");
            /*one last time I am also creating a sleep method that allows the program that allows the program to wait 2 seconds
        before executing the scanner method
         */
            Thread.sleep(2000);
        }
        /*Here I am using an If-else statement to check if the sum of the seven numbers is even or odd,
         I am also creating a method to launch the Maxsip Telecom application page if the numbers are odd
        while using the Try-catch methpd to handle the exception that comes with the execution.
         */
        if (sum % 2 == 0) {
            System.out.println("Please Retry!");
        } else {
            try {
                URL url = new URL("https://maxsipconnects.com/apply/");
                Desktop.getDesktop().browse(url.toURI());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}



