package Maxsip;

import java.awt.*;
import java.net.URL;
import java.util.Scanner;


/*The purpose of this code is to prepare the user for the application process at Maxsip Telecom
by filling out some necessary information
 */
public class maxsip_debitCardInfo {
    public static void main(String[] args) throws InterruptedException {

        //Here I am creating a print statement that declares a welcome message to the user and thanks the user.
        System.out.println("Welcome to the Maxsip Telecom Registry!");
        System.out.println("Thank you for using our services");
        /*Here I am creating a sleep method that allows the program that allows the program to wait 3 seconds
        before executing the scanner method
         */
        Thread.sleep(3000);
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their first name
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt user to enter their last name
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();

        // Prompt user to enter their debit card number
        System.out.println("Please enter your debit card number: ");
        String debitCardNumber = scanner.nextLine();

        // Prompt user to enter their expiration date
        System.out.println("Please enter your expiration date: ");
        String expirationDate = scanner.nextLine();

        // Prompt user to enter their security code
        System.out.println("Please enter your security code: ");
        String securityCode = scanner.nextLine();

        // Print out the user's information
        System.out.println("Your name is: " + firstName + " " + lastName);
        System.out.println("Your debit card number is: " + debitCardNumber);
        System.out.println("Your expiration date is: " + expirationDate);
        System.out.println("Your security code is: " + securityCode);

        /*Here I am creating a sleep method that allows the program that allows the program to wait 2 seconds
        before executing the scanner method
         */

        Thread.sleep(2000);
        /*Here I am creating a method to launch the Maxsip Telecom application page
        while using the Try-catch method to handle the exception that comes with the execution.
         */

        try {
            URL url = new URL("https://maxsipconnects.com/apply/");
            Desktop.getDesktop().browse(url.toURI());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
