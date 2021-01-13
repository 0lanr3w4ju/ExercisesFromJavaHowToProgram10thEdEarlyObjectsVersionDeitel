package com.alpha.company;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptingApplicationObject {

    public static void main(String[] args) {
        EncryptingApplication encryptingApplication = new EncryptingApplication();
        Scanner scan = new Scanner(System.in);

        int counter = 0;

        while(counter < encryptingApplication.setFourDigit.length) {
            System.out.print("enter digit > ");
            encryptingApplication.setFourDigit[counter] = scan.nextInt();
            ++counter;
        }

        encryptingApplication.addSevenToDigitAndDivideByTenToGetRemainder();
        encryptingApplication.firstSwap();
        encryptingApplication.secondSwap();
        System.out.println("encrypted: "+ Arrays.toString(encryptingApplication.setFourDigit));
    }

}
