package com.alpha.company;

import java.util.Scanner;

public class FindTheSmallestValueObj {

    public static void main(String[] args) {
        FindTheSmallestValue findTheSmallestValue = new FindTheSmallestValue();
        Scanner scan = new Scanner(System.in);

        int counter = 0;

        System.out.print("enter limit of values to be compared: ");

        try {
            findTheSmallestValue.setLimit = scan.nextInt();
        } catch (Exception error) {
            System.err.println("incorrect value");
        }

        if (findTheSmallestValue.setLimit <= 0) {
            System.out.println("no value to compare");
        }else {
            while (counter < findTheSmallestValue.setLimit) {
                System.out.print("enter value: ");

                try {
                    findTheSmallestValue.findSmallestValue(scan.nextInt());
                }catch (Exception error){
                    System.err.println("incorrect value");
                }
                counter++;
            }
            System.out.println(findTheSmallestValue.toString());
        }
    }

}
