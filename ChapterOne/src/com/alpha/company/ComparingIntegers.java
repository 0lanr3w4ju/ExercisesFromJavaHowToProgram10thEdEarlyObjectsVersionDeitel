package com.alpha.company;

import java.util.Scanner;

public class ComparingIntegers {
    //an application that asks the user to enter two integers,
    //obtains them from the user and displays the larger number
    //followed by the words "is larger".
    //if number are equal, prints the message "these numbers are equal."

    //class variables
    int integerOne;
    int integerTwo;

    //class methods
    public int largerValue(int integerOne, int integerTwo) {
        if (integerOne > integerTwo) {
            System.out.println(integerOne +" is larger.");
            return integerOne;
        }
        if (integerTwo > integerOne) {
            System.out.println(integerTwo +" is larger.");
            return integerTwo;
        }
        System.out.println("these numbers are equal.");
        return integerOne;
    }

    //class object
    public static void main(String[] args) {

        ComparingIntegers comparingIntegers = new ComparingIntegers();
        Scanner scan = new Scanner(System.in);

        //prompts
        System.out.print("enter first integer: ");
        comparingIntegers.integerOne = scan.nextInt();

        System.out.print("enter second integer: ");
        comparingIntegers.integerTwo = scan.nextInt();

        //method call for output
        comparingIntegers.largerValue(comparingIntegers.integerOne, comparingIntegers.integerTwo);

    }
}
