package com.alpha.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Table fightTable = new Table();
        Scanner scan = new Scanner(System.in);

        boolean click = true;
        String fName;
        String lName;

        while (click) {

            System.out.print("enter First-name || 'Q' to quit program: ");
            fName = scan.nextLine();
            if (fName.equals("Q".toLowerCase()))
                click = false;
            else {
                System.out.print("enter Last-name || 'Q' to quit program: ");
                lName = scan.nextLine();
                System.out.println();
                if (lName.equals("Q".toLowerCase()))
                    click = false;
                else {fightTable.addPlayers(fName, lName);}
            }
        }

        int possiblePairings = fightTable.nameList.size() / 2;
        for (int count = 0; count < possiblePairings; count++) {
            System.out.println(fightTable.toString());
        }
    }
}