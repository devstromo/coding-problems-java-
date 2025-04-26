package com.devstromo.hard.p329

class SolutionKt {
    private val directions = arrayOf(
        intArrayOf(-1, 0),
        intArrayOf(1, 0),
        intArrayOf(0, -1),
        intArrayOf(0, 1)
    )
    private var rows = 0
    private var cols = 0

    fun longestIncreasingPath(matrix: Array<IntArray>): Int {
        rows = matrix.size
        cols = matrix[0].size
        val memo: Array<IntArray> = Array(rows) { IntArray(cols) }
        var maxPath = 0

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                maxPath = maxOf(maxPath, dfs(matrix, r, c, memo))
            }
        }

        return maxPath
    }

    private fun dfs(matrix: Array<IntArray>, r: Int, c: Int, memo: Array<IntArray>): Int {
        if (memo[r][c] != 0) return memo[r][c]

        var maxLength = 1 // itself

        for ((dr, dc) in directions) {
            val newRow = r + dr
            val newCol = c + dc

            if (newRow in 0 until rows &&
                newCol in 0 until cols &&
                matrix[newRow][newCol] > matrix[r][c]
            ) {
                val length = 1 + dfs(matrix, newRow, newCol, memo)
                maxLength = maxOf(maxLength, length)
            }
        }

        memo[r][c] = maxLength
        return maxLength
    }
}