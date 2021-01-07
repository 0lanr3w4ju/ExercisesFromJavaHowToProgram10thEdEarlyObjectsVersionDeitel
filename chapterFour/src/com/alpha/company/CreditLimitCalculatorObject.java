package com.alpha.company;

import java.util.Scanner;

public class CreditLimitCalculatorObject {
/*
    display the new balance of a customer and determine whether the new
    balance exceeds the customer’s credit limit.
*/

    public static void main(String[] args) {
        //class declaration
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        Scanner scan = new Scanner(System.in);

        System.out.print("enter any integer to use calculator or (-1) to exit: ");
        while(scan.nextInt() != -1) { //while loop (sentinel controlled)
            //prompts
            System.out.print("enter account NO: ");
            creditLimitCalculator.setAccountNumber(scan.nextInt());

            System.out.print("enter credit balance at the start of the month: ");
            creditLimitCalculator.setBalanceAtTheStartOfTheMonth(scan.nextInt());

            System.out.print("enter total items charged by customer in a month: ");
            creditLimitCalculator.setTotalItemsChargedByCustomerInAMonth(scan.nextInt());

            System.out.print("enter total credit applied to customer A/C in a month: ");
            creditLimitCalculator.setTotalCreditsAppliedToCustomerAccountInAMonth(scan.nextInt());

            System.out.print("enter credit limit: ");
            creditLimitCalculator.setCreditLimit(scan.nextInt());

            //outputs
            System.out.println("############################################");
            System.out.printf("customer's account number is: %d%n", creditLimitCalculator.getAccountNumber());
            System.out.printf("credit balance at the start of the month is: $%d%n", creditLimitCalculator.getBalanceAtTheStartOfTheMonth());
            System.out.printf("total items charged by customer in a month: $%d%n", creditLimitCalculator.getTotalItemsChargedByCustomerInAMonth());
            System.out.printf("total credit applied to customer A/C in a month: $%d%n", creditLimitCalculator.getTotalCreditsAppliedToCustomerAccountInAMonth());
            System.out.printf("customer's credit limit: $%d%n", creditLimitCalculator.getCreditLimit());
            System.out.println("0######################1#################++#");
            if (creditLimitCalculator.getCreditLimit() < creditLimitCalculator.newBalance())
                System.out.println("credit limit exceeded");
            else System.out.println("within credit limit");
            System.out.println("############################################");
            System.out.print("enter any integer to use calculator or (-1) to exit: ");
        }
    }

}
