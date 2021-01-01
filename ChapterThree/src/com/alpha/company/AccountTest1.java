package com.alpha.company;

import java.util.Scanner;

public class AccountTest1 {
/*
    a new displayAccount method that contains one copy of an output statement. The method's
    parameter will be an Account object and the method will output the object’s name and balance.
*/

    public static void main(String[] args) {
        //class variable
        double amount;

        //class declaration and initialization
        Account account1 = new Account("deborah agboola", 50.00);
        Account account2 = new Account("damilola badmus", -7.53);

        Scanner scan = new Scanner(System.in);

        //displays initial balance of each object
        displayAccount(account1, account2);

        //prompt
        System.out.print("enter deposit amount for account1: ");
        amount = scan.nextDouble();
        account1.deposit(amount); //adds amount to account1's balance

        //displays balances
        displayAccount(account1, account2);

        //prompt
        System.out.print("enter deposit amount for account2: ");
        amount = scan.nextDouble();
        account2.deposit(amount); //adds amount to account2's balance

        //displays balances
        displayAccount(account1, account2);
    }

    public static void displayAccount(Account accountToDisplay1, Account accountToDisplay2) {
        System.out.printf("%s balance: $%.2f%n", accountToDisplay1.getName(), accountToDisplay1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", accountToDisplay2.getName(), accountToDisplay2.getBalance());
    }

}
