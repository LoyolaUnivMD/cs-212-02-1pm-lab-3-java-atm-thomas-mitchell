// Programmers:  [your names here]
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

        System.out.println("What would you like to do: \nDeposit\nWithdraw\nCheck balance\nLeave");
        String choice = input.nextLine().strip().toLowerCase();
        while (choice != " leave") {
            if (choice.equals("deposit")){

            }else if (choice.equals("withdraw")){

           }else if (choice.equals("check balance")){

           }else if (choice.equals("leave")){
               System.out.println("Goodbye");
               break;

           }else{
               System.out.println("Invalid Choice");
           }
        }

    }
}
