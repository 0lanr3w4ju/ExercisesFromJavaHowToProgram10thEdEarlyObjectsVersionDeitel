package com.alpha.company;

import java.util.Scanner;
/* a program that takes ten values and outputs the two largest values
 * author: olanrewaju alawode*/

public class FindTwoLargestNumbersObject {

    public static void main(String[] args) {
        //class declaration
        FindTwoLargestNumbers findTwoLargestNumbers = new FindTwoLargestNumbers();
        Scanner scan = new Scanner(System.in);

        //class variable
        int counter = 0;

        //counter controlled while loop
        while (counter < 10) {
            System.out.print("enter number: ");
            findTwoLargestNumbers.findTwoLargest(scan.nextInt());
            counter++;
        }

        //output
        System.out.println();
        System.out.printf("larger number = %d \n" +
                "large number = %d", findTwoLargestNumbers.firstLargestNumber, findTwoLargestNumbers.secondLargestNumber);
    }

}
