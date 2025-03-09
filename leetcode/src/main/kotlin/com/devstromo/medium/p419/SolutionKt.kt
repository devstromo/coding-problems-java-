package com.devstromo.medium.p419

class SolutionKt {
    fun countBattleships(board: Array<CharArray>): Int {
        val rows = board.size
        val cols = board[0].size
        var count = 0

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (board[r][c] == 'X') {
                    if (r > 0 && board[r - 1][c] == 'X') continue
                    if (c > 0 && board[r][c - 1] == 'X') continue
                    count++
                }
            }
        }
        return count
    }

    fun countBattleshipsBest(board: Array<CharArray>): Int {
        var count = 0
        for (row in board.indices) {
            for (col in board[0].indices) {
                if (board[row][col] == 'X') {
                    if (!(col > 0 && board[row][col - 1] == 'X') && !(row > 0 && board[row - 1][col] == 'X')) {
                        count++
                    }
                }
            }
        }
        return count
    }
}