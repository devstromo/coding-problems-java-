package com.devstromo.medium.p419;

public class Solution {
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int rows, cols;
    public int countBattleships(char[][] board) {
        rows = board.length;
        cols = board[0].length;
        int battleshipsCount = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 'X') {
                    battleshipsCount++;
                    dfs(board, r, c);
                }
            }
        }
        return battleshipsCount;
    }

    public int countBattleshipsBest(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int count = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // Only count the first cell of a battleship
                if (board[r][c] == 'X') {
                    if (r > 0 && board[r - 1][c] == 'X') continue; // Part of a vertical ship
                    if (c > 0 && board[r][c - 1] == 'X') continue; // Part of a horizontal ship
                    count++; // Found a new battleship
                }
            }
        }
        return count;
    }

    private void dfs(char[][] board, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] == '.') {
            return;
        }
        board[r][c] = '.';
        for (int[] dir : directions) {
            dfs(board, r + dir[0], c + dir[1]);
        }
    }
}
