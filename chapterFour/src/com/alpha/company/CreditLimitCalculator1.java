package com.alpha.company;

public class CreditLimitCalculator1 {

    private final int accountNumber;
    private final int balanceAtTheStartOfTheMonth;
    private final int totalItemsChargedByCustomerInAMonth;
    private final int totalCreditsAppliedToCustomerAccountInAMonth;
    private final int creditLimit;

    public CreditLimitCalculator1(int accountNumber, int balanceAtTheStartOfTheMonth, int totalItemsChargedByCustomerInAMonth, int totalCreditsAppliedToCustomerAccountInAMonth, int creditLimit) {
        this.accountNumber = accountNumber;
        this.balanceAtTheStartOfTheMonth = balanceAtTheStartOfTheMonth;
        this.totalItemsChargedByCustomerInAMonth = totalItemsChargedByCustomerInAMonth;
        this.totalCreditsAppliedToCustomerAccountInAMonth = totalCreditsAppliedToCustomerAccountInAMonth;
        this.creditLimit = creditLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalanceAtTheStartOfTheMonth() {
        return balanceAtTheStartOfTheMonth;
    }

    public int getTotalItemsChargedByCustomerInAMonth() {
        return totalItemsChargedByCustomerInAMonth;
    }

    public int getTotalCreditsAppliedToCustomerAccountInAMonth() {
        return totalCreditsAppliedToCustomerAccountInAMonth;
    }

    public int newBalance() {
        return (getBalanceAtTheStartOfTheMonth() + getTotalItemsChargedByCustomerInAMonth()) - getTotalCreditsAppliedToCustomerAccountInAMonth();
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String diplayMessage() {
        if (newBalance() > getCreditLimit()) {
            return "credit limit exceeded";
        } else return "within credit limit";
    }
}