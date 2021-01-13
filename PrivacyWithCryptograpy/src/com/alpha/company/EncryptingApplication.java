package com.alpha.company;

public class EncryptingApplication {

    int[] setFourDigit = new int[4];

    int counter = 0;

    public void addSevenToDigitAndDivideByTenToGetRemainder() {
        while (counter < setFourDigit.length) {
            setFourDigit[counter] += 7;
            setFourDigit[counter] %= 10;
            ++counter;
        }
    }

    public void firstSwap() {
        int tempDigit = setFourDigit[0];
        setFourDigit[0] = setFourDigit[2];
        setFourDigit[2] = tempDigit;
    }

    public void secondSwap() {
        int tempDigit = setFourDigit[1];
        setFourDigit[1] = setFourDigit[3];
        setFourDigit[3] = tempDigit;
    }

}
