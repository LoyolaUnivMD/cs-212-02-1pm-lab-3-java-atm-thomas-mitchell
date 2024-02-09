// Programmers:  Michel & Thomas
// Course:  CS 212
// Due Date: 02/11/2024
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

class Lab3 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        DecimalFormat moneyFMT = new DecimalFormat("$,###.##");

        // Initialize variables
        double balance = 212.90;
        System.out.print("What is your name");
        String name = input.next();
        System.out.println("Welcome " + name);

        int choice = intInputLimit(4, "What would you like to do: \n1.Deposit\n2.Withdraw\n3.Check balance\n4.Leave");
        while (choice != 4) {

            if (choice == 1) {
                double deposit = doubleInput("How much money do you want to deposit? ");
                balance += deposit;

            } else if (choice == 2) {
                double withdraw = doubleInputLimit(balance,"How much money do you want to withdraw? ");
                balance -= withdraw;

            } else if (choice == 3) {
                System.out.println("Current Balance: " + moneyFMT.format(balance));
            } else {
                System.out.println("Invalid Choice");
            }
            choice = intInputLimit(4, "What would you like to do: \n1.Deposit\n2.Withdraw\n3.Check balance\n4.Leave");

        }
        choice = intInputLimit(2, "Do you want your receipt printed or emailed? (1.print or 2.email)");
        System.out.println("Thank you for using the ATM");
        if (choice == 1) {
            System.out.println("Do not forget to take your receipt.");
        }else{
            System.out.println("Check your email for your receipt");
        }

    }

    public static int intInputLimit(int limit, String prompt) {
        int num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(prompt);
            try {
                num = input.nextInt();
                if (num <= limit && num > 0) {
                    valid = true;
                } else {
                    System.out.println("Invalid choice ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input ");
                input.next();
            }
        }
        return num;
    }
    public static int intInput(String prompt) {
        int num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(prompt);
            try {
                num = input.nextInt();
                if (num > 0) {
                    valid = true;
                } else {
                    System.out.println("Invalid choice ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input ");
                input.next();
            }
        }
        return num;
    }
    public static double doubleInputLimit(Double limit, String prompt) {
        double num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(prompt);
            try {
                num = input.nextDouble();
                if (num > 0 && num <= limit) {
                    valid = true;
                } else {
                    System.out.println("Invalid choice ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input ");
                input.next();
            }
        }
        return num;
    }
    public static double doubleInput(String prompt) {
        double num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(prompt);
            try {
                num = input.nextDouble();
                if (num > 0) {
                    valid = true;
                } else {
                    System.out.println("Invalid choice ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input ");
                input.next();
            }
        }
        return num;
    }
}
