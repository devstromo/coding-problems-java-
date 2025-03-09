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
}