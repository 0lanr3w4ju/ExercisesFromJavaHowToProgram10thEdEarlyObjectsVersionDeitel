package com.alpha.company;

public class Cryptography {

    int break1, break2, break3, break4;

    public void setFourDigit(int number) {
        int first = number / 10;
        break1 = number % 10;

        int second = first / 10;
        break2 = first % 10;

        int third = second / 10;
        break3 = second % 10;

        break4 = third % 10;
    }

    public void addSevenToDigitAndDivideByTenToGetRemainder() {
        //add 7
        break4 += 7;
        break3 += 7;
        break2 += 7;
        break1 += 7;

        //then modulo 10
        break4 %= 10;
        break3 %= 10;
        break2 %= 10;
        break1 %= 10;
    }

    public void swapFirstDigitForThirdAndSecondForFourth() {
        System.out.printf("encrypted: %d %d %d %d", break2, break1, break4, break3);
    }

}
