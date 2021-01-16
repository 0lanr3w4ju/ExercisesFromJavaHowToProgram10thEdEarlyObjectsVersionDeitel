package com.alpha.company;

//this program takes in four input and encrypts it.
//author Olanrewaju Alawode

public class Encryption {

    //class variable
    static int break1, break2, break3, break4;

    //class methods
    public void encrypt(int number) {
        int first = number / 10;
        break1 = number % 10;

        int second = first / 10;
        break2 = first % 10;

        int third = second / 10;
        break3 = second % 10;

        break4 = third % 10;

        //add seven to digit
        break4 += 7;
        break3 += 7;
        break2 += 7;
        break1 += 7;

        //and divide by ten to get remainder
        break4 %= 10;
        break3 %= 10;
        break2 %= 10;
        break1 %= 10;

        //swap first digit for third and second for fourth and displays result
        System.out.printf("encrypted value: %d %d %d %d %n", break2, break1, break4, break3);
    }

}
