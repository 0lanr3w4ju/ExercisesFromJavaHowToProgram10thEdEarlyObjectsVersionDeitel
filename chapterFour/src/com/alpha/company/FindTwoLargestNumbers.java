package com.alpha.company;

public class FindTwoLargestNumbers {
    /* a program that takes ten values and outputs the two largest values
    * author: olanrewaju alawode*/

    //class variables
    public int firstLargestNumber;
    public int secondLargestNumber;

    //class method
    public void findTwoLargest(int number) {
        if (number > 0) {
            if (number > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = number;
            } else if (number > secondLargestNumber) {
                secondLargestNumber = number;
            }
        }
    }

}
