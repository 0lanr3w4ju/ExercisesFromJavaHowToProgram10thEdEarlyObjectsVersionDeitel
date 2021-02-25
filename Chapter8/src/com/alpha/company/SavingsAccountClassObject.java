package com.alpha.company;

public class SavingsAccountClassObject {

    public static void main(String[] args) {
        SavingsAccountClass saver1 = new SavingsAccountClass();
        SavingsAccountClass saver2 = new SavingsAccountClass();

        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        SavingsAccountClass.modifyingInterestRate(4);

        System.out.printf("initial savings balance for saver1: $%.2f%n", saver1.getSavingsBalance());
        double totalYearInterest = 0;
        for(int index = 0; index < 12; index++) {
            totalYearInterest += saver1.calculateMonthlyInterest();
        };
        saver1.setSavingsBalance(totalYearInterest + saver1.getSavingsBalance());
        System.out.printf("new savings balance for saver1 after 12 months: $%.2f%n", saver1.getSavingsBalance());
        System.out.println();
        System.out.printf("initial savings balance for saver2: $%.2f%n", saver2.getSavingsBalance());
        totalYearInterest = 0;
        for(int index = 0; index < 12; index++) {
            totalYearInterest += saver2.calculateMonthlyInterest();
        };
        saver2.setSavingsBalance(totalYearInterest + saver2.getSavingsBalance());
        System.out.printf("new savings balance for saver2 after 12 months: $%.2f%n", saver2.getSavingsBalance());

        SavingsAccountClass.modifyingInterestRate(5);

        System.out.println();
        System.out.printf("current savings balance for saver1: $%.2f%n", saver1.getSavingsBalance());
        saver1.setSavingsBalance(saver1.calculateMonthlyInterest() + saver1.getSavingsBalance());
        System.out.printf("new savings balance for saver1 after 1 month and 5percent: $%.2f%n", saver1.getSavingsBalance());
        System.out.println();
        System.out.printf("current savings balance for saver2: $%.2f%n", saver2.getSavingsBalance());
        saver2.setSavingsBalance(saver2.calculateMonthlyInterest() + saver2.getSavingsBalance());
        System.out.printf("new savings balance for saver2 after 1 month and 5percent: $%.2f%n", saver2.getSavingsBalance());
    }
}
