package com.alpha.company;

import java.util.Scanner;

public class TicTacToeObject {
    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();
        Scanner scan = new Scanner(System.in);

        System.out.print("""
                Tic-Tac-Toe-Go!
                ..a 2-player game
                lets get your names
                Player-1:\s""");
        String playerOne = scan.nextLine();
        System.out.println();
        System.out.print("Player-2: ");
        String playerTwo = scan.nextLine();
        System.out.println();

        do {
            int rowNo, colNo;
            System.out.printf("make a move %s%n",playerOne);
            System.out.print("enter row number: ");
            rowNo = scan.nextInt();
            System.out.print("enter column number: ");
            colNo = scan.nextInt();

            ticTacToe.playerOnesMove(rowNo, colNo);

            System.out.printf("make a move %s%n",playerTwo);
            System.out.print("enter row number: ");
            rowNo = scan.nextInt();
            System.out.print("enter column number: ");
            colNo = scan.nextInt();

            ticTacToe.playerTwosMove(rowNo, colNo);

            ticTacToe.determineWhetherTheGameHasBeenWonOnRowZero();
            ticTacToe.determineWhetherTheGameHasBeenWonOnRowOne();
            ticTacToe.determineWhetherTheGameHasBeenWonOnRowTwo();
            ticTacToe.determineWhetherTheGameHasBeenWonOnR0C0_R2C2();
            ticTacToe.determineWhetherTheGameHasBeenWonOnColumnZero();
            ticTacToe.determineWhetherTheGameHasBeenWonOnColumnOne();
            ticTacToe.determineWhetherTheGameHasBeenWonOnColumnTwo();
            ticTacToe.determineWhetherTheGameHasBeenWonOnR2C0_R0C2();
        } while (true);

    }
}
