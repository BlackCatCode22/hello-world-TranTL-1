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

    static void theHelloMethod(){
        System.out.println(" \n Hello from theHelloMethod() !");
    }

    //Create a method that gets input.
    // This is the method's definition.
    static void aPersonalGreeting(String someName) {
        System.out.println(" \n Hello " + someName + " how are you today?");
    }

    // Create a method that gets two integers and returns their sum.
    // Create two int parameters
    static int sumTwoInts(int num1, int num2) {
        int mySum = 0;
        mySum = num1 + num2;

        return mySum;

    }



    public static void main(String[] args) {
        System.out.printf("\n\n...Welcome to Methods!\n");


        // Variables (members)
        String theUserName = "";
        // Create a scanner object to get input from the user

        Scanner scanner = new Scanner(System.in);

        // Get the user's name
        System.out.println("\n Please enter your name: ");
        theUserName = scanner.nextLine();

        // Call (invoke) our greeting method.
        aPersonalGreeting(theUserName);

        theHelloMethod();

        // variable
        int aSum = 0;
        // Call our new sum method.
        aSum = sumTwoInts(3,4);

        System.out.println("\n aSum is: " + aSum);

        System.out.println("\n This is the end of my program");





/*
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
        System.out.println("\n Hello," + userName + " you've" +
                " worked: " + hoursWorked + " hours this week!");

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
         */
    }
}

