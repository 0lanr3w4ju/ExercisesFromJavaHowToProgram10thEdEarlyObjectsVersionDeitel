package com.alpha.company;

import org.w3c.dom.ls.LSOutput;

public class CreditLimitCalculator {
/*
    a Java application that determines whether any of several
     department-store customers has exceeded the credit limit
     on a charge account.
*/

    //class variables
    private int accountNumber;
    private int balanceAtTheStartOfTheMonth;
    private int totalItemsChargedByCustomerInAMonth;
    private int totalCreditsAppliedToCustomerAccountInAMonth;
    private int creditLimit;

    //class methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalanceAtTheStartOfTheMonth() {
        return balanceAtTheStartOfTheMonth;
    }

    public void setBalanceAtTheStartOfTheMonth(int balanceAtTheStartOfTheMonth) {
        this.balanceAtTheStartOfTheMonth = balanceAtTheStartOfTheMonth;
    }

    public int getTotalItemsChargedByCustomerInAMonth() {
        return totalItemsChargedByCustomerInAMonth;
    }

    public void setTotalItemsChargedByCustomerInAMonth(int totalItemsChargedByCustomerInAMonth) {
        this.totalItemsChargedByCustomerInAMonth = totalItemsChargedByCustomerInAMonth;
    }

    public int getTotalCreditsAppliedToCustomerAccountInAMonth() {
        return totalCreditsAppliedToCustomerAccountInAMonth;
    }

    public void setTotalCreditsAppliedToCustomerAccountInAMonth(int totalCreditsAppliedToCustomerAccountInAMonth) {
        this.totalCreditsAppliedToCustomerAccountInAMonth = totalCreditsAppliedToCustomerAccountInAMonth;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int newBalance() { //method for newBalance
        return (getBalanceAtTheStartOfTheMonth() + getTotalItemsChargedByCustomerInAMonth()) - getTotalCreditsAppliedToCustomerAccountInAMonth();
    }

}
