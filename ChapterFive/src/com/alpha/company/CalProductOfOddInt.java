package com.alpha.company;

public class CalProductOfOddInt {

    /*
      an application that calculates the product
      of the odd integers from 1 to 15
    */

    public int calProductOfOddIntMethod() {
        int total = 1;
        for (int index = 1; index < 16; index += 2) {
            total *= index;
        }
        return total;
    }

}
