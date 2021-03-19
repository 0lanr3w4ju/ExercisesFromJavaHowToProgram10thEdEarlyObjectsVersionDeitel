package com.alpha.company;

import java.util.Arrays;

public class TicTacToe {

    private final cellState[][] board = new cellState[3][3];

    public enum cellState {
        X, O, EMPTY
    }

    public TicTacToe() {
        for (cellState[] cellStates : board) {
            Arrays.fill(cellStates, cellState.EMPTY);
        }
    }

    public cellState getBoard(int rowNumber, int columnNumber) {
            return board[rowNumber][columnNumber];
    }

    public void playerOnesMove(int rowNumber, int columnNumber) {
        if (verifyMoveIsToAnEmptyCell(rowNumber,columnNumber)) {
            board[rowNumber][columnNumber] = cellState.X;
        } else {
            System.out.println("error!");
        }
    }

    public void playerTwosMove(int rowNumber, int columnNumber) {
        if (verifyMoveIsToAnEmptyCell(rowNumber,columnNumber)) {
            board[rowNumber][columnNumber] = cellState.O;
        } else {
            System.out.println("error!");
        }
    }

    public boolean verifyMoveIsToAnEmptyCell(int rowNumber,int columnNumber) {
        return board[rowNumber][columnNumber] == cellState.EMPTY;
    }

    public boolean determineWhetherTheGameHasBeenWonOnRowZero() {
        boolean result = true;

        if (board[0][0] == cellState.X) {
            if (board[0][1] == cellState.X) {
                if (board[0][2] == cellState.X) {
                    result = false;
                }
            }
        } else if (board[0][0] == cellState.O) {
            if (board[0][1] == cellState.O) {
                if (board[0][2] == cellState.O) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean determineWhetherTheGameHasBeenWonOnRowOne() {
        boolean result = true;

        if (board[1][0] == cellState.X) {
            if (board[1][1] == cellState.X) {
                if (board[1][2] == cellState.X) {
                    result = false;
                }
            }
        } else if (board[1][0] == cellState.O) {
            if (board[1][1] == cellState.O) {
                if (board[1][2] == cellState.O) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean determineWhetherTheGameHasBeenWonOnRowTwo() {
        boolean result = true;

        if (board[2][0] == cellState.X) {
            if (board[2][1] == cellState.X) {
                if (board[2][2] == cellState.X) {
                    result = false;
                }
            }
        } else if (board[2][0] == cellState.O) {
            if (board[2][1] == cellState.O) {
                if (board[2][2] == cellState.O) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean determineWhetherTheGameHasBeenWonOnR0C0_R2C2() {
        boolean result = true;

        if (board[0][0] == cellState.X) {
            if (board[1][1] == cellState.X) {
                if (board[2][2] == cellState.X) {
                    result = false;
                }
            }
        } else if (board[0][0] == cellState.O) {
            if (board[1][1] == cellState.O) {
                if (board[2][2] == cellState.O) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean determineWhetherTheGameHasBeenWonOnColumnZero() {
        boolean result = true;

        if (board[0][0] == cellState.X) {
            if (board[1][0] == cellState.X) {
                if (board[2][0] == cellState.X) {
                    result = false;
                }
            }
        } else if (board[0][0] == cellState.O) {
            if (board[1][0] == cellState.O) {
                if (board[2][0] == cellState.O) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean determineWhetherTheGameHasBeenWonOnColumnOne() {
        boolean result = true;

        if (board[0][1] == cellState.X) {
            if (board[1][1] == cellState.X) {
                if (board[2][1] == cellState.X) {
                    result = false;
                }
            }
        } else if (board[0][1] == cellState.O) {
            if (board[1][1] == cellState.O) {
                if (board[2][1] == cellState.O) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean determineWhetherTheGameHasBeenWonOnColumnTwo() {
        boolean result = true;

        if (board[0][2] == cellState.X) {
            if (board[1][2] == cellState.X) {
                if (board[2][2] == cellState.X) {
                    result = false;
                }
            }
        } else if (board[0][2] == cellState.O) {
            if (board[1][2] == cellState.O) {
                if (board[2][2] == cellState.O) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean determineWhetherTheGameHasBeenWonOnR2C0_R0C2() {
        boolean result = true;

        if (board[2][0] == cellState.X) {
            if (board[1][1] == cellState.X) {
                if (board[0][2] == cellState.X) {
                    result = false;
                }
            }
        } else if (board[2][0] == cellState.O) {
            if (board[1][1] == cellState.O) {
                if (board[0][2] == cellState.O) {
                    result = false;
                }
            }
        }
        return result;
    }

}
