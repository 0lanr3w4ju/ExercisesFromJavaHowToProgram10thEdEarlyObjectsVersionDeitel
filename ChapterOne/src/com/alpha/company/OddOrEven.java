package com.alpha.company;

import java.util.Scanner;

public class OddOrEven {
//    an application that reads an integer and determines and prints whether it’s odd or even.

    //class variable
    int integer;

    //class method
    public int oddOrEven(int integer) {
        if (integer % 2 == 0) {
            System.out.println(integer +" is an even number.");
            return 1;
        } else System.out.println(integer +" is an odd number.");
        return -1;
    }

    //class object
    public static void main(String[] args) {
        OddOrEven oddOrEven = new OddOrEven();
        Scanner scan = new Scanner(System.in);

        //prompt
        System.out.print("enter integer: ");
        oddOrEven.integer = scan.nextInt();

        //method call for output
        oddOrEven.oddOrEven(oddOrEven.integer);
    }

}
