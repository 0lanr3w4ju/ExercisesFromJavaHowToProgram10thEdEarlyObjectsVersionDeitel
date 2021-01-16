package com.alpha.company;

//this program takes the encrypted value from Encryption program and decrypts it.
//author Olanrewaju Alawode

public class Decryption {

    //class methods
    public void decrypt() {
        // subtracts 7 from digit
        Encryption.break4 -= 7;
        Encryption.break3 -= 7;
        Encryption.break2 -= 7;
        Encryption.break1 -= 7;

        // then calls on the lastDecryptStage() to complete the reversal
        Encryption.break4 = lastDecryptStage(Encryption.break4);
        Encryption.break3 = lastDecryptStage(Encryption.break3);
        Encryption.break2 = lastDecryptStage(Encryption.break2);
        Encryption.break1 = lastDecryptStage(Encryption.break1);

        //outputs result
        System.out.printf("decrypted value: %d %d %d %d", Encryption.break4, Encryption.break3, Encryption.break2, Encryption.break1);
    }

    // static method to convert negative digit to positive digit and subtracts converted digit from 10.
    private static int lastDecryptStage(int number) {
        if (number < 0) {
            number = Math.abs(number) - 10;
            number = Math.abs(number); //reverses a negative result
        }
        return number;
    }

}
