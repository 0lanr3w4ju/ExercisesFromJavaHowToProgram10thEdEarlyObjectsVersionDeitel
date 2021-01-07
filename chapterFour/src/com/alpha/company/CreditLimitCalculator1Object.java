package com.alpha.company;

import java.util.Scanner;

public class CreditLimitCalculator1Object {

    public static void main(String[] args) {
        //class variables
        int accountNumber;
        int balanceAtTheStartOfTheMonth;
        int totalItemsChargedByCustomerInAMonth;
        int totalCreditsAppliedToCustomerAccountInAMonth;
        int creditLimit;

        //scanner class declaration
        Scanner scan = new Scanner(System.in);

        //how to use the program instruction
        System.out.println("****************************************");
        System.out.print("""
                enter any number to use calculator\s
                enter [-1] to exit program\s
                >\s""");
        while (scan.nextInt() != -1) { //while l00p using sentinel controlled loop
            //prompts
            System.out.print("enter account number: ");
            accountNumber = scan.nextInt();

            System.out.print("enter balance at the start of the month: ");
            balanceAtTheStartOfTheMonth = scan.nextInt();

            System.out.print("enter total items charged by customer in a month: ");
            totalItemsChargedByCustomerInAMonth = scan.nextInt();

            System.out.print("enter total credits applied to customer account in a month: ");
            totalCreditsAppliedToCustomerAccountInAMonth = scan.nextInt();

            System.out.print("enter credit limit: ");
            creditLimit = scan.nextInt();

            //class declaration
            CreditLimitCalculator1 creditLimitCalculator1 = new CreditLimitCalculator1(accountNumber, balanceAtTheStartOfTheMonth, totalItemsChargedByCustomerInAMonth, totalCreditsAppliedToCustomerAccountInAMonth, creditLimit);

            //outputs
            System.out.println("****************************************");
            System.out.println("account number: "+ creditLimitCalculator1.getAccountNumber() +"\n" +
                    "balance at the start of the month: $"+ creditLimitCalculator1.getBalanceAtTheStartOfTheMonth() +"\n" +
                    "total items charged by customer in a month: $"+ creditLimitCalculator1.getTotalItemsChargedByCustomerInAMonth() +"\n" +
                    "total credits applied to customer account in a month: $"+ creditLimitCalculator1.getTotalCreditsAppliedToCustomerAccountInAMonth() +"\n" +
                    "credit limit: $"+ creditLimitCalculator1.getCreditLimit());
            System.out.println(creditLimitCalculator1.displayMessage());
            System.out.println("****************************************");
            //how to use the program instruction
            System.out.print("""
                    enter any number to use calculator\s
                    enter [-1] to exit program\s
                    >\s""");
        }
    }

}
