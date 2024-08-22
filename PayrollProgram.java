// Tran Le 8/20/24
/*
* PayrollProgram.jav
*
* Input: User's name, hours, weekly hours worked (no hour fractions), user's hourly payrate
*
* Processing: total weekly pay including overtime if more than 40
* hours were worked that week
*
* Output: Polite greeting to the user and regular pay and overtime pay
*
*
 */
//

import javax.naming.Name;
import java.util.Scanner;



public class PayrollProgram {
    public static void main(String[] args) {
        System.out.println("\n\n...Welcome to the payroll program...\n");

        String userName = "";
        int hoursWorked = 0;
        int overtimeHours = 0;
        int payRate = 0;
        double PayRate = 0.0;
        double normalPay = 0.0;
        double overTimepay = 0.0;
        double payCheck = 0.0;

        // Say hello to the user and get user pay information.
        // Get the user's name.
        // Create a scanner object to get input from the user
        Scanner myScannerObj = new Scanner(System.in);

        // Get the user's name.
        System.out.println("\n Please enter your name: ");
        userName = myScannerObj.nextLine();

        System.out.println("\n Hello " + userName + ". I hope you're doing well today. ");

        // Get weekly hours worked from the user.
        // Output statement prompting the user for hrs  worked
        System.out.println(" \n Please enter how many hours you worked this week \n(please use whole numbers)");
        // Use the Scanner object to get input from this prompt, and store what was returned
        // from your Scanner object in variable
        hoursWorked = myScannerObj.nextInt();

        // Output statement prompting the user for hrs  worked
        System.out.println(" \n Please enter your hourly pay rate \n(please use whole numbers)");
        // Use the Scanner object to get input from this prompt, and store what was returned
        // from your Scanner object in variable
        payRate = myScannerObj.nextInt();

        // Create an output statement to the user echoing the user's input.
        System.out.println("\n Hello," + userName + " you worked: " + hoursWorked + " hours this week!");

        // Processing
        overtimeHours = hoursWorked - 40;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
            overTimepay = overtimeHours + payRate * 1.5;
            normalPay = 40 * payRate;
            payCheck = normalPay + overTimepay;
        }
        else {
            payCheck = hoursWorked * payRate;
        }


        // Create an output statement to user's pay this week
        System.out.println("\n Hello," + userName + "\n Your total amount of hours and pay rate for this week is: $" + payCheck);
    }
}