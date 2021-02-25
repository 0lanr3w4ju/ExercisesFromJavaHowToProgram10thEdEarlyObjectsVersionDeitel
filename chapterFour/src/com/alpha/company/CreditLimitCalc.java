package com.alpha.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class CreditLimitCalc {
    private int accountNumber;
    private int balanceAtTheBeginningOfMonth;
    private int totalOfAllItemsCharged;
    private int totalOfAllCreditsAppliedToCustomer;
    private int allowedCreditLimit;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalanceAtTheBeginningOfMonth() {
        return balanceAtTheBeginningOfMonth;
    }

    public void setBalanceAtTheBeginningOfMonth(int balanceAtTheBeginningOfMonth) {
        this.balanceAtTheBeginningOfMonth = balanceAtTheBeginningOfMonth;
    }

    public int getTotalOfAllItemsCharged() {
        return totalOfAllItemsCharged;
    }

    public void setTotalOfAllItemsCharged(int totalOfAllItemsCharged) {
        this.totalOfAllItemsCharged = totalOfAllItemsCharged;
    }

    public int getTotalOfAllCreditsAppliedToCustomer() {
        return totalOfAllCreditsAppliedToCustomer;
    }

    public void setTotalOfAllCreditsAppliedToCustomer(int totalOfAllCreditsAppliedToCustomer) {
        this.totalOfAllCreditsAppliedToCustomer = totalOfAllCreditsAppliedToCustomer;
    }

    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
        this.allowedCreditLimit = allowedCreditLimit;
    }

    public int calculateNewBalance() {
        return balanceAtTheBeginningOfMonth + totalOfAllItemsCharged - totalOfAllCreditsAppliedToCustomer;

    }

    public static void main(String[] args) {
        CreditLimitCalc creditLimitCalc = new CreditLimitCalc();

        System.out.println("enter ac number: ");
        creditLimitCalc.accountNumber = scan.nextInt();
    }
}
