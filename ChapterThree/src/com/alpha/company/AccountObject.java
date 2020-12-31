package com.alpha.company;

import javax.swing.*;

public class AccountObject {

    public static void main(String[] args) {
        String name;
        String balance;
        double convertedBalance;
        String amount;
        double convertedAmount;


        name = JOptionPane.showInputDialog("enter account name");

        balance = JOptionPane.showInputDialog("enter account balance");
        convertedBalance = Double.parseDouble(balance);

        Account account = new Account(name, convertedBalance);

        amount = JOptionPane.showInputDialog("enter amount to withdraw");
        convertedAmount = Double.parseDouble(amount);
        account.withdraw(convertedAmount);

        JOptionPane.showMessageDialog(null, "account name: "+ account.getName() +"\n" +
                "account balance: $"+ account.getBalance());
    }

}
