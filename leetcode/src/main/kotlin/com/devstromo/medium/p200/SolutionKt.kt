package com.devstromo.medium.p200

class SolutionKt {
    private val directions = arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1))
    private var row = 0
    private var col = 0

    fun numIslands(grid: Array<CharArray>): Int {
        row = grid.size
        col = grid[0].size
        var count = 0
        for (r in 0 until row) {
            for (c in 0 until col) {
                if (grid[r][c] == '1') {
                    count++
                    dfs(grid, r, c)
                }
            }
        }
        return count
    }

    private fun dfs(grid: Array<CharArray>, r: Int, c: Int) {
        if (r !in grid.indices || c !in grid[0].indices || grid[r][c] == '0') {
            return
        }
        grid[r][c] = '0'
        for (direction in directions) {
            dfs(grid, r + direction[0], c + direction[1])
        }
    }
}