package com.alpha.company;

public class FindTheLargestNumber {

    //class variable
    private int largest = 0;

    //class methods
    public void findLargestNumberMethod(int number) {
        if (largest < number) {
            largest = number;
        }
    }

    public void setLargest(int number) {
        this.largest = number;
    }

    public int getLargest() {
        return largest;
    }
}
