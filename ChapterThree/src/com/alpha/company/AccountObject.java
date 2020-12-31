package com.alpha.company;

import javax.swing.*;

public class AccountObject {

    public static void main(String[] args) {
        //class variables
        String name;
        String balance;
        double convertedBalance;
        String amount;
        double convertedAmount;

        //prompts to initialize constructor
        name = JOptionPane.showInputDialog("enter account name");

        balance = JOptionPane.showInputDialog("enter account balance");
        convertedBalance = Double.parseDouble(balance);

        //class Account declaration
        Account account = new Account(name, convertedBalance);

        //prompt for to test withdraw method
        amount = JOptionPane.showInputDialog("enter amount to withdraw");
        convertedAmount = Double.parseDouble(amount);
        account.withdraw(convertedAmount);

        //bank details
        JOptionPane.showMessageDialog(null, "account name: "+ account.getName() +"\n" +
                "account balance: $"+ account.getBalance());
    }

}
