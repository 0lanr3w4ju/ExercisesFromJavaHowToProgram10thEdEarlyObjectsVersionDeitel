package com.alpha.company;

import java.util.Scanner;

public class Arithmetic {
    //an application that ask the user to enter two integers, obtains them from user and prints their sum, product, difference and quotient.

    //class variables
    int integerOne;
    int integerTwo;

    //class methods
    public int sum(int integerOne, int integerTwo) {
        return integerOne + integerTwo;
    }

    public int product(int integerOne, int integerTwo) {
        return integerOne * integerTwo;
    }

    public int difference(int integerOne, int integerTwo) {
        return integerOne - integerTwo;
    }

    public int quotient(int integerOne, int integerTwo) {
        return integerOne / integerTwo;
    }

    //object class
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Scanner scan = new Scanner(System.in);

        //prompts
        System.out.print("enter first integer: ");
        arithmetic.integerOne = scan.nextInt();

        System.out.print("enter second integer: ");
        arithmetic.integerTwo = scan.nextInt();

        //sum output
        System.out.println(arithmetic.integerOne +" + "+ arithmetic.integerTwo +" = "+ arithmetic.sum(arithmetic.integerOne, arithmetic.integerTwo));

        //product output
        System.out.println(arithmetic.integerOne +" * "+ arithmetic.integerTwo +" = "+ arithmetic.product(arithmetic.integerOne, arithmetic.integerTwo));

        //difference output
        System.out.println(arithmetic.integerOne +" - "+ arithmetic.integerTwo +" = "+ arithmetic.difference(arithmetic.integerOne, arithmetic.integerTwo));

        //quotient output
        System.out.println(arithmetic.integerOne +" / "+ arithmetic.integerTwo +" = "+ arithmetic.quotient(arithmetic.integerOne, arithmetic.integerTwo));
    }

}
