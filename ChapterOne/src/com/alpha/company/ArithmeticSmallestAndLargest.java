package com.alpha.company;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
//an application that inputs three integers from the user and
//displays the sum, average, product, smallest and largest
//of the numbers.

    //class variables
    int integerOne;
    int integerTwo;
    int integerThree;
    int largest = 0;
    int smallest = 0;

    //class methods
    public int sum(int integerOne, int integerTwo, int integerThree) {
        return integerOne + integerTwo + integerThree;
    }

    public int product(int integerOne, int integerTwo, int integerThree) {
        return integerOne * integerTwo * integerThree;
    }

    public int smallestValue(int integerOne, int integerTwo, int integerThree) {
        if (integerOne < integerTwo) {
            smallest = integerOne;
        } else smallest = integerTwo;
        if (integerThree < smallest) {
            smallest = integerThree;
        }
        return smallest;
    }

    public int largestValue(int integerOne, int integerTwo, int integerThree) {
        if (integerOne > integerTwo) {
            largest = integerOne;
        } else largest = integerTwo;
        if (integerThree > largest) {
            largest = integerThree;
        }
        return largest;
    }

    //class object
    public static void main(String[] args) {
        ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
        Scanner scan = new Scanner(System.in);

        //prompts
        System.out.print("enter first integer: ");
        arithmeticSmallestAndLargest.integerOne = scan.nextInt();

        System.out.print("enter second integer: ");
        arithmeticSmallestAndLargest.integerTwo = scan.nextInt();

        System.out.print("enter third integer: ");
        arithmeticSmallestAndLargest.integerThree = scan.nextInt();

        //sum output
        System.out.println(arithmeticSmallestAndLargest.integerOne +" + "+ arithmeticSmallestAndLargest.integerTwo +" + "+ arithmeticSmallestAndLargest.integerThree +" = "+ arithmeticSmallestAndLargest.sum(arithmeticSmallestAndLargest.integerOne, arithmeticSmallestAndLargest.integerTwo, arithmeticSmallestAndLargest.integerThree));

        //average output
        System.out.println(arithmeticSmallestAndLargest.integerOne +" + "+ arithmeticSmallestAndLargest.integerTwo +" + "+ arithmeticSmallestAndLargest.integerThree +" / 3 = "+ arithmeticSmallestAndLargest.sum(arithmeticSmallestAndLargest.integerOne, arithmeticSmallestAndLargest.integerTwo, arithmeticSmallestAndLargest.integerThree) / 3);

        //product output
        System.out.println(arithmeticSmallestAndLargest.integerOne +" * "+ arithmeticSmallestAndLargest.integerTwo +" * "+ arithmeticSmallestAndLargest.integerThree +" = "+ arithmeticSmallestAndLargest.product(arithmeticSmallestAndLargest.integerOne, arithmeticSmallestAndLargest.integerTwo, arithmeticSmallestAndLargest.integerThree));

        //smallest value output
        System.out.println(arithmeticSmallestAndLargest.smallestValue(arithmeticSmallestAndLargest.integerOne, arithmeticSmallestAndLargest.integerTwo, arithmeticSmallestAndLargest.integerThree) +" is the smallest value");

        //largest value output
        System.out.println(arithmeticSmallestAndLargest.largestValue(arithmeticSmallestAndLargest.integerOne, arithmeticSmallestAndLargest.integerTwo, arithmeticSmallestAndLargest.integerThree) +" is the largest value");
    }

}
