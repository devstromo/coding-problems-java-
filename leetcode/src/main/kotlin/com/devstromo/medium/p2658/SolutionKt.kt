package com.devstromo.medium.p2658

class SolutionKt {
    fun findMaxFish(grid: Array<IntArray>): Int {
        var max = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] != 0) {
                    max = maxOf(max, explore(i, j, grid))
                }
            }
        }
        return max
    }

    private fun explore(row: Int, col: Int, grid: Array<IntArray>): Int {
        if (row < 0 || col < 0 || row >= grid.size || col >= grid[0].size) return 0
        if (grid[row][col] == 0) return 0
        var total = grid[row][col]
        grid[row][col] = 0
        total += explore(row, col + 1, grid) +
                explore(row, col - 1, grid) +
                explore(row + 1, col, grid) +
                explore(row - 1, col, grid)
        return total
    }
}