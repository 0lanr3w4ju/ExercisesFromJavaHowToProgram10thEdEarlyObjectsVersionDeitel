package com.alpha.company;

import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {
    /* an application that inputs one number consisting of five
    digits from the user, separates the number into its individual
    digits and prints the digits separated from one another by three
    spaces each. */

    public void FourDigit(int number) {
       int first = number / 10;
       int break1 = number % 10;

       int second = first / 10;
       int break2 = first % 10;

       int third = second / 10;
       int break3 = second % 10;

        int break4 = third % 10;

        System.out.println("separated digits: "+ break4 +" "+ break3 +" "+ break2 +" "+ break1);
    }

    public static void main(String[] args) {
        SeparatingTheDigitsInAnInteger separatingTheDigitsInAnInteger = new SeparatingTheDigitsInAnInteger();
        Scanner scan = new Scanner(System.in);

        System.out.print("enter your four digit " +
                "> ");
        separatingTheDigitsInAnInteger.FourDigit(scan.nextInt());
    }

}
