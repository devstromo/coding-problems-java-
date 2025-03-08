package com.devstromo.medium.p130;

public class Solution {
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int rows, cols;
    boolean[][] vis;
    int n;
    int m;

    public void solve(char[][] board) {
        rows = board.length;
        cols = board[0].length;

        // Step 1: Mark 'O's connected to the border
        for (int r = 0; r < rows; r++) {
            if (board[r][0] == 'O') dfs(board, r, 0);
            if (board[r][cols - 1] == 'O') dfs(board, r, cols - 1);
        }
        for (int c = 0; c < cols; c++) {
            if (board[0][c] == 'O') dfs(board, 0, c);
            if (board[rows - 1][c] == 'O') dfs(board, rows - 1, c);
        }

        // Step 2: Flip 'O' -> 'X' (captured), 'T' -> 'O' (restore border-connected)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X'; // Captured
                } else if (board[r][c] == 'T') {
                    board[r][c] = 'O'; // Restore
                }
            }
        }
    }

    public void solveBest(char[][] board) {
        n = board.length;
        m = board[0].length;
        vis = new boolean[board.length][board[0].length];
        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') dfsBest(board, 0, i);
            if (board[n - 1][i] == 'O') dfsBest(board, n - 1, i);
        }
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') dfsBest(board, i, 0);
            if (board[i][m - 1] == 'O') dfsBest(board, i, m - 1);
        }
        replace(board, 'O', 'X');
        replace(board, 'T', 'O');
    }

    private void dfs(char[][] board, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != 'O') {
            return;
        }

        board[r][c] = 'T'; // Mark border-connected regions
        for (int[] dir : directions) {
            dfs(board, r + dir[0], c + dir[1]);
        }
    }

    private void dfsBest(char[][] board, int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] != 'O' || vis[i][j]) return;

        vis[i][j] = true;
        board[i][j] = 'T';
        dfsBest(board, i + 1, j);
        dfsBest(board, i - 1, j);
        dfsBest(board, i, j + 1);
        dfsBest(board, i, j - 1);

    }

    private void replace(char[][] board, char from, char to) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == from) {
                    board[i][j] = to;
                }
            }
        }
    }
}
