// Programmers:  Michel & Thomas
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.SortedMap;

class Lab3 {
    public static void main(String[] args) {

       // Initialize variables
        double balance = 212.90;

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name");
        String name = input.next();
        System.out.println("Welcome " + name);

        System.out.println("What would you like to do: \nWithdraw\nCheck balance\nLeave");
        String choice = input.nextLine().strip().toLowerCase();
        while (!choice.equals("leave")) {

           if (choice.equals("deposit")) {
               System.out.print("How much money do you want to deposit? ");
               int deposit = input.nextInt();
               balance += deposit;

           } else if (choice.equals("withdraw")) {
               System.out.print("How much money do you want to withdraw? ");
               int withdraw = input.nextInt();
               while (balance < withdraw) {
                   System.out.println("not enough money");
                   System.out.print("How much money do you want to withdraw? ");
                   withdraw = input.nextInt();
               }
               balance -= withdraw;

           } else if (choice.equals("check balance")){

           } else if (choice.equals("leave")) {
               System.out.println("Goodbye");
               break;

           }else {
               System.out.println("Invalid Choice");
           }
           System.out.println("What would you like to do: \nDeposit\nWithdraw\nCheck balance\nLeave");
           choice = input.nextLine().strip().toLowerCase();

        }

    }
}
