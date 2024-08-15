// This is a comment
/*
* Tran Le
* 8/15/24
* AddTwoInts.java
 */

import java.util.Scanner; // Import the Scanner class


public class AddTwoInts {
        public static void main(String[] args) {
            System.out.println('\n\n Welcome to the Double Int Program!\n\n');

            int firstNum= 0;
            int secondNum = 0;
            int sumofBothNumbers = 0;

            System.out.println("\n The value of sumOfBothNumbers is: " + sumofBothNumbers);

            // Create a Scanner object
            Scanner myScannerObject = new Scanner(System.in);

            // Ask user for the first int
            System.out.println("\n Please enter a whole number: ");
            firstNum = myScannerObject.nextInt();

            // Unit text for our first user input
            System.out.println("\n The value of firstNum is: " + firstNum);

            // Ask user for the second int
            System.out.println("\n Please enter second a whole number: ");
            secondNum = myScannerObject.nextInt();

            // Unit text for our second user input
            System.out.println("\n The value of secondNum is: " + secondNum);

            // Processing
            // Add the two ints input from the user.
            // the total of firstNum and secondNum will be stored in
            // the variable named: sumOfBothNumbers

            sumOfBothNumbers = firstNum + secondNum;

            // Output the value of the variable named: sumOfBothNumbers;
            System.out.println("\n The value of sumOfBothNumbers is: " + sumofBothNumbers);
        }
}
