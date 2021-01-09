package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return monoHorizontal(board) || monoVertical(board);
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            result = true;
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] != 1) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            result = true;
            for (int column = 0; column < board.length; column++) {
                if (board[column][row] != 1) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}
