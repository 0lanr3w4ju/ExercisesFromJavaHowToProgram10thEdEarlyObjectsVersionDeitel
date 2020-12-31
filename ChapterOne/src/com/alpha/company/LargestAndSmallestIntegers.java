package com.alpha.company;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
//    an application that reads five integers and determines
//    and prints the largest and smallest integers in the group.

    //class variables
    int largest = 0;
    int smallest = 0;
    int integerOne;
    int integerTwo;
    int integerThree;
    int integerFour;
    int integerFive;

    //class methods
    public int largestValue(int integerOne, int integerTwo, int integerThree, int integerFour, int integerFive) {
        largest = Math.max(integerOne, integerTwo);
        if (integerThree > largest) {
            largest = integerThree;
        }
        if (integerFour > largest) {
            largest = integerFour;
        }
        if (integerFive > largest) {
            largest = integerFive;
        }
        return largest;
    }

    public int smallestValue(int integerOne, int integerTwo, int integerThree, int integerFour, int integerFive) {
        smallest = Math.min(integerOne, integerTwo);
        if (integerThree < smallest) {
            smallest = integerThree;
        }
        if (integerFour < smallest) {
            smallest = integerFour;
        }
        if (integerFive < smallest) {
            smallest = integerFive;
        }
        return smallest;
    }

    //class object
    public static void main(String[] args) {
        LargestAndSmallestIntegers largestAndSmallestIntegers = new LargestAndSmallestIntegers();
        Scanner scan = new Scanner(System.in);

        //prompts
        System.out.print("enter first integer: ");
        largestAndSmallestIntegers.integerOne = scan.nextInt();

        System.out.print("enter second integer: ");
        largestAndSmallestIntegers.integerTwo = scan.nextInt();

        System.out.print("enter third integer: ");
        largestAndSmallestIntegers.integerThree = scan.nextInt();

        System.out.print("enter fourth integer: ");
        largestAndSmallestIntegers.integerFour = scan.nextInt();

        System.out.print("enter fifth integer: ");
        largestAndSmallestIntegers.integerFive = scan.nextInt();

        //largest value output
        System.out.println("largest value = "+ largestAndSmallestIntegers.largestValue(largestAndSmallestIntegers.integerOne, largestAndSmallestIntegers.integerTwo, largestAndSmallestIntegers.integerThree, largestAndSmallestIntegers.integerFour, largestAndSmallestIntegers.integerFive));

        //smallest value output
        System.out.println("smallest value = "+ largestAndSmallestIntegers.smallestValue(largestAndSmallestIntegers.integerOne, largestAndSmallestIntegers.integerTwo, largestAndSmallestIntegers.integerThree, largestAndSmallestIntegers.integerFour, largestAndSmallestIntegers.integerFive));
    }

}
