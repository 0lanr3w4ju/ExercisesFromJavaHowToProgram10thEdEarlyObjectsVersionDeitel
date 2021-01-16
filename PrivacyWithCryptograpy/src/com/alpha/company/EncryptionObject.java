package com.alpha.company;

import java.util.Scanner;

public class EncryptionObject {

    public static void main(String[] args) {
        //class declarations
        Encryption encryption = new Encryption();
        Decryption decryption = new Decryption();
        Scanner scan = new Scanner(System.in);

        //prompt
        System.out.print("enter four digits \n" +
                "> ");

        //class methods
        encryption.encrypt(scan.nextInt());

        System.out.println("********************");
        System.out.print("1 to decrypt: ");
        int choice = scan.nextInt();

        if (choice == 1) {
            decryption.decrypt();
        }

    }

}
