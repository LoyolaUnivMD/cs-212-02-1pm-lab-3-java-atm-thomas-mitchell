// Programmers:  Michel & Thomas
// Course:  CS 212
// Due Date: 2/11/24
// Lab Assignment: 3
// Problem Statement: a program that acts at a smart ATM.
// Data In: choices, deposit amount, withdraw amount
// Data Out: account balance
// Credits: intInput and doubleInput are based off code I made in highschool

//import decimalformat, inputMismatchException, Scanner
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

class Lab3 {
    //makes a new public scanner called input
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //makes a new format for displaying money
        DecimalFormat moneyFMT = new DecimalFormat("$ #,##0.00");

        // Initialize variables
        double balance = 212.90;
        //get input for name
        System.out.print("What is your name: ");
        String name = input.next();
        //welcome message
        System.out.println("Welcome " + name);

        //get input for choice using intInput function
        int choice = intInput(true,4, "What would you like to do: \n1.Deposit\n2.Withdraw\n3.Check balance\n4.Leave");
        // loop while choice does not equal leave
        while (choice != 4) {

            //if choice is equal to 1
            if (choice == 1) {
                //get input for how much to deposit using the doubleInput function
                double deposit = doubleInput(false, 0.0,"How much money do you want to deposit? ");
                //add the deposit amount to the balance
                balance += deposit;

                //if choice is equal to 2
            } else if (choice == 2) {
                // get input for how much to withdraw using doubleInput function
                double withdraw = doubleInput(true, balance, "How much money do you want to withdraw? ");
                //subtract the withdraw amount from the balance
                balance -= withdraw;

                //if choice is equal to 3
            } else if (choice == 3) {
                //output the balance and format it
                System.out.println("Current Balance: " + moneyFMT.format(balance));
                //if the choice does not equal any of the options output invalid choice
            } else {
                System.out.println("Invalid Choice");
            }
            //get input for choice again using intInput function
            choice = intInput(true,4, "What would you like to do: \n1.Deposit\n2.Withdraw\n3.Check balance\n4.Leave");

        }
        //get input for recipt choice using intInput function
        choice = intInput(true, 2, "Do you want your receipt printed or emailed? (1.print or 2.email)");
        //output thank you message
        System.out.println("Thank you for using the ATM");
        //if the user inputted 1 output to not forget their recipt
        if (choice == 1) {
            System.out.println("Do not forget to take your recipt.");
            //otherwise output to check their email for the recipt
        } else {
            System.out.println("Check your email for your recipt");
        }

    }

    //function to check if an int input is valid and under a limit if useLimit is true
    public static int intInput(boolean useLimit, int limit, String prompt) {
        //initialize the variables
        int num = 0;
        boolean valid = false;
        //loops until the input is valid
        while (!valid) {
            //outputs the prompt
            System.out.println(prompt);
            //tries to get the input and set as an int
            try {
                num = input.nextInt();
                //checks if we should check for a limit or not
                if (useLimit) {
                    // if the inputted num is less than the limit and greater than 0
                    if (num <= limit && num > 0) {
                        //sets valid to true which ends the loop
                        valid = true;
                        //otherwise outputs invalid choice
                    } else {
                        System.out.println("Invalid choice ");
                    }
                    //if not, just check if the num is over 0
                } else {
                    if (num > 0) {
                        //sets valid to true which ends the loop
                        valid = true;
                        //otherwise outputs invalid choice
                    } else {
                        System.out.println("Invalid choice ");
                    }
                }
                //if the program gets an error output invalid input and try again
            } catch (InputMismatchException e) {
                System.out.println("Invalid input ");
                input.next();
            }
        }
        //returns a valid num between the limit and 0
        return num;
    }
    //function to check if an double input is valid and under a limit if useLimit is true
    public static double doubleInput(boolean useLimit, Double limit, String prompt) {
        //initialize the variables
        double num = 0;
        boolean valid = false;
        //loops until the input is valid
        while (!valid) {
            //outputs the prompt
            System.out.println(prompt);
            //tries to get the input and set as an double
            try {
                num = input.nextDouble();
                //checks if we should check for a limit or not
                if (useLimit) {
                    // if the inputted num is less than the limit and greater than 0
                    if (num > 0 && num <= limit) {
                        //sets valid to true which ends the loop
                        valid = true;
                    } else {
                        //otherwise outputs invalid choice
                        System.out.println("Invalid choice ");
                    }
                    //if not, just check if the num is over 0
                } else {
                    if (num > 0) {
                        //sets valid to true which ends the loop
                        valid = true;
                    } else {
                        //otherwise outputs invalid choice
                        System.out.println("Invalid choice ");
                    }
                }
                //if the program gets an error output invalid input and trys again
            } catch (InputMismatchException e) {
                System.out.println("Invalid input ");
                input.next();
            }
        }
        //returns a valid num
        return num;
    }
}

