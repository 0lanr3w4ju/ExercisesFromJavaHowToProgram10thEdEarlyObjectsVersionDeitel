package com.alpha.company;

public class Cryptography {

    int initDigit1, initDigit2, initDigit3, initDigit4;
    int break1, break2, break3, break4;

    public void setFourDigit(int number) {
        int first = number / 10;
        break1 = number % 10;
        initDigit1 = number % 10;

        int second = first / 10;
        break2 = first % 10;
        initDigit2 = first % 10;

        int third = second / 10;
        break3 = second % 10;
        initDigit3 = second % 10;

        break4 = third % 10;
        initDigit4 = third % 10;
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
        System.out.printf("encrypted value: %d %d %d %d %n", break2, break1, break4, break3);
    }

    public void decrypt() {
        initDigit4 = break4 -= 7;
        initDigit3 = break3 -= 7;
        initDigit2 = break2 -= 7;
        initDigit1 = break1 -= 7;

        int number4 = lastDecryptStage(initDigit4);
        int number3 = lastDecryptStage(initDigit3);
        int number2 = lastDecryptStage(initDigit2);
        int number1 = lastDecryptStage(initDigit1);

        System.out.printf("decrypted value: %d %d %d %d", number4, number3, number2, number1);
    }

    public static int lastDecryptStage(int number) {
        if (number < 0) {
            number = Math.abs(number) - 10;
            number = Math.abs(number);
        }
        return number;
    }

}
