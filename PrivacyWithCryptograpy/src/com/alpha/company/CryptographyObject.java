package com.alpha.company;

import java.util.Scanner;

public class CryptographyObject {

    public static void main(String[] args) {
        Cryptography cryptography = new Cryptography();
        Scanner scan = new Scanner(System.in);

        System.out.print("enter four digits " +
                "> ");
        cryptography.setFourDigit(scan.nextInt());

        cryptography.addSevenToDigitAndDivideByTenToGetRemainder();
        cryptography.swapFirstDigitForThirdAndSecondForFourth();

        cryptography.decrypt();
    }

}
