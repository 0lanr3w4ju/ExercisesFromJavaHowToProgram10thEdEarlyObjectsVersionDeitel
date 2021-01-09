package com.alpha.company;

import java.util.Scanner;

public class FindTheLargestNumberObject {

    public static void main(String[] args) {
        //class variable
        int counter = 1;

        //class declaration
        FindTheLargestNumber findTheLargestNumber = new FindTheLargestNumber();
        Scanner scan = new Scanner(System.in);

        //while loop using counter controlled loop
        while (counter <= 10) {
            System.out.print("enter number: ");
            findTheLargestNumber.findLargestNumberMethod(scan.nextInt());
            counter++;
        }
        //output
        System.out.print("largest number = "+ findTheLargestNumber.getLargest());
    }

}
