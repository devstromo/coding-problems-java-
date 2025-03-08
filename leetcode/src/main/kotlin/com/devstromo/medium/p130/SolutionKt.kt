package com.devstromo.medium.p130

class SolutionKt {
    private val directions = arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1))
    private var rows = 0
    private var cols = 0

    fun solve(board: Array<CharArray>) {
        rows = board.size
        cols = board[0].size

        // Step 1: Mark 'O's connected to the border
        for (r in 0 until rows) {
            if (board[r][0] == 'O') dfs(board, r, 0)
            if (board[r][cols - 1] == 'O') dfs(board, r, cols - 1)
        }
        for (c in 0 until cols) {
            if (board[0][c] == 'O') dfs(board, 0, c)
            if (board[rows - 1][c] == 'O') dfs(board, rows - 1, c)
        }

        // Step 2: Flip 'O' -> 'X' (captured), 'T' -> 'O' (restore border-connected)
        for (r in 0 until rows) {
            for (c in 0 until cols) {
                when (board[r][c]) {
                    'O' -> board[r][c] = 'X' // Captured
                    'T' -> board[r][c] = 'O' // Restore
                }
            }
        }
    }

    private fun dfs(board: Array<CharArray>, r: Int, c: Int) {
        if (r !in board.indices || c !in board[0].indices || board[r][c] != 'O') {
            return
        }

        board[r][c] = 'T' // Mark border-connected regions
        for (dir in directions) {
            dfs(board, r + dir[0], c + dir[1])
        }
    }
}