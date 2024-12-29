package vn.edu.usth.sudoku;



public class SudokuBoard {
    private int[][] board;

    public SudokuBoard() {
        board = new int[9][9];
        // Initialize your board or load a puzzle
    }

    public int getCell(int row, int col) {
        return board[row][col];
    }

    public void setCell(int row, int col, int value) {
        board[row][col] = value;
    }

    // Add additional methods for game logic here
}