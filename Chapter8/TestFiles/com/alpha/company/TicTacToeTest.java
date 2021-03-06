package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void toTestThatCellsInBoardAreSetToEmpty() {
        TicTacToe ticTacToe = new TicTacToe();
        TicTacToe.cellState cellState1 = TicTacToe.cellState.EMPTY;

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                TicTacToe.cellState result = ticTacToe.getBoard(row, column);
                assertEquals(cellState1, result);
            }
        }
    }

    @Test
    void toTestThatWhereEverPlayerOneMovesIsAnX() {
        TicTacToe ticTacToe = new TicTacToe();
        TicTacToe.cellState cellState1 = TicTacToe.cellState.X;

        ticTacToe.playerOnesMove(0, 0);

        assertEquals(cellState1, ticTacToe.getBoard(0,0));
    }

    @Test
    void toTestThatWhereEverPlayerTwoMovesIsAnO() {
        TicTacToe ticTacToe = new TicTacToe();
        TicTacToe.cellState cellState1 = TicTacToe.cellState.O;

        ticTacToe.playerTwosMove(0, 0);

        assertEquals(cellState1, ticTacToe.getBoard(0,0));
    }

    @Test
    void toTestThatMovesAreOnlyMadeToEmptyCells() {
        TicTacToe ticTacToe = new TicTacToe();
        TicTacToe.cellState cellState1 = TicTacToe.cellState.O;

        ticTacToe.playerTwosMove(2, 0);
        ticTacToe.playerOnesMove(2, 0);

        assertEquals(cellState1, ticTacToe.getBoard(2,0));
    }

    @Test
    void determineWhetherTheGameHasBeenWonOnRowZero() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playerTwosMove(0, 0);
        ticTacToe.playerTwosMove(0, 1);
        ticTacToe.playerTwosMove(0, 2);

        assertFalse(ticTacToe.determineWhetherTheGameHasBeenWonOnRowZero());
    }

    @Test
    void determineWhetherTheGameHasBeenWonOnRowOne() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playerTwosMove(1, 0);
        ticTacToe.playerTwosMove(1, 1);
        ticTacToe.playerTwosMove(1, 2);

        assertFalse(ticTacToe.determineWhetherTheGameHasBeenWonOnRowOne());
    }

    @Test
    void determineWhetherTheGameHasBeenWonOnRowTwo() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playerTwosMove(2, 0);
        ticTacToe.playerTwosMove(2, 1);
        ticTacToe.playerTwosMove(2, 2);

        assertFalse(ticTacToe.determineWhetherTheGameHasBeenWonOnRowTwo());
    }

    @Test
    void determineWhetherTheGameHasBeenWonOnR0C0_R2C2() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playerTwosMove(0, 0);
        ticTacToe.playerTwosMove(1, 1);
        ticTacToe.playerTwosMove(2, 2);

        assertFalse(ticTacToe.determineWhetherTheGameHasBeenWonOnR0C0_R2C2());
    }

    @Test
    void determineWhetherTheGameHasBeenWonOnColumnZero() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playerTwosMove(0, 0);
        ticTacToe.playerTwosMove(1, 0);
        ticTacToe.playerTwosMove(2, 0);

        assertFalse(ticTacToe.determineWhetherTheGameHasBeenWonOnColumnZero());
    }

    @Test
    void determineWhetherTheGameHasBeenWonOnColumnOne() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playerTwosMove(0, 1);
        ticTacToe.playerTwosMove(1, 1);
        ticTacToe.playerTwosMove(2, 1);

        assertFalse(ticTacToe.determineWhetherTheGameHasBeenWonOnColumnOne());
    }

    @Test
    void determineWhetherTheGameHasBeenWonOnColumnTwo() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playerTwosMove(0, 2);
        ticTacToe.playerTwosMove(1, 2);
        ticTacToe.playerTwosMove(2, 2);

        assertFalse(ticTacToe.determineWhetherTheGameHasBeenWonOnColumnTwo());
    }

    @Test
    void determineWhetherTheGameHasBeenWonOnR2C0_R0C2() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playerTwosMove(2, 0);
        ticTacToe.playerTwosMove(1, 1);
        ticTacToe.playerTwosMove(0, 2);

        assertFalse(ticTacToe.determineWhetherTheGameHasBeenWonOnR2C0_R0C2());
    }

}