package com.alpha.company;

public class FindTheSmallestValue {

    /* a program that finds the smallest of several integers.
    * program assumes that the first integer entered is the
    * number of values to input from the user */

    int setLimit;
    int smallestValue;

    public void findSmallestValue(int value){
        if (value < smallestValue){
            smallestValue = value;
        }
    }

    @Override
    public String toString() {
        return "smallest value: " + smallestValue;
    }
}
