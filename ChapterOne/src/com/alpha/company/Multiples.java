package com.alpha.company;

import java.util.Scanner;

public class Multiples {
//    an application that reads two integers, determines whether the first is a
//    multiple of the second and prints the result.

    //class variables
    int result;
    int integerOne;
    int integerTwo;

    //class method
    public int oddOrEven(int integerOne, int integerTwo) {
        if (integerOne % integerTwo == 0) {
            result = integerOne / integerTwo;
            System.out.println(integerOne +" / "+ integerTwo +" = "+ result );
            return result;
        } else System.out.println(integerOne +" is not a multiple of "+ integerTwo);
        return -1;
    }

    //class object
    public static void main(String[] args) {
        Multiples multiples = new Multiples();
        Scanner scan = new Scanner(System.in);

        //prompt
        System.out.print("enter first integer: ");
        multiples.integerOne = scan.nextInt();

        System.out.print("enter second integer: ");
        multiples.integerTwo = scan.nextInt();

        //method call for output
        multiples.oddOrEven(multiples.integerOne, multiples.integerTwo);
    }

}
