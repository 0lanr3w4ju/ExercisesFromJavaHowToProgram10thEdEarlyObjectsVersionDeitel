package com.alpha.company;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
//    a program that inputs five numbers and determines
//    and prints the number of negative numbers input, the number of positive numbers input and
//    the number of zeros input.

    //class variables
    int negativeCounter = 0;
    int positiveCounter = 0;
    int zeroCounter = 0;
    int integer;

    //class method
    public int negativePositiveAndZeroCounter(int integer) {
        if (integer < 0) {
            negativeCounter++;
            return negativeCounter;
        } else if (integer > 0) {
            positiveCounter++;
            return positiveCounter;
        }else zeroCounter++;
        return zeroCounter;
    }

    //class object
    public static void main(String[] args) {
        NegativePositiveAndZeroValues negativePositiveAndZeroValues = new NegativePositiveAndZeroValues();
        Scanner scan = new Scanner(System.in);

        //prompt
        System.out.print("enter first integer: ");
        negativePositiveAndZeroValues.integer = scan.nextInt();
        negativePositiveAndZeroValues.negativePositiveAndZeroCounter(negativePositiveAndZeroValues.integer);

        System.out.print("enter second integer: ");
        negativePositiveAndZeroValues.integer = scan.nextInt();
        negativePositiveAndZeroValues.negativePositiveAndZeroCounter(negativePositiveAndZeroValues.integer);

        System.out.print("enter third integer: ");
        negativePositiveAndZeroValues.integer = scan.nextInt();
        negativePositiveAndZeroValues.negativePositiveAndZeroCounter(negativePositiveAndZeroValues.integer);

        System.out.print("enter fourth integer: ");
        negativePositiveAndZeroValues.integer = scan.nextInt();
        negativePositiveAndZeroValues.negativePositiveAndZeroCounter(negativePositiveAndZeroValues.integer);

        System.out.print("enter fifth integer: ");
        negativePositiveAndZeroValues.integer = scan.nextInt();
        negativePositiveAndZeroValues.negativePositiveAndZeroCounter(negativePositiveAndZeroValues.integer);

        //negative counter output
        System.out.println("negative numbers = "+ negativePositiveAndZeroValues.negativeCounter);

        //positive counter output
        System.out.println("positive numbers = "+ negativePositiveAndZeroValues.positiveCounter);

        //zero counter output
        System.out.println("zero numbers = "+ negativePositiveAndZeroValues.zeroCounter);
    }

}
