package com.devstromo.medium.p1905

class SolutionKt {
    private var rows = 0
    private var cols: Int = 0
    private val directions: Array<IntArray> =
        arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1))

    fun countSubIslands(grid1: Array<IntArray>, grid2: Array<IntArray>): Int {
        fun dfs(grid: Array<IntArray>, r: Int, c: Int) {
            if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0) {
                return
            }
            grid[r][c] = 0 // Mark as visited
            for (dir in directions) {
                dfs(grid, r + dir[0], c + dir[1])
            }
        }

        rows = grid1.size
        cols = grid1[0].size


        // Step 1: Remove all invalid islands in grid2
        for (r in 0..<rows) {
            for (c in 0..<cols) {
                if (grid2[r][c] == 1 && grid1[r][c] == 0) {
                    dfs(grid2, r, c) // Remove invalid land
                }
            }
        }


        // Step 2: Count valid sub-islands
        var subIslands = 0
        for (r in 0..<rows) {
            for (c in 0..<cols) {
                if (grid2[r][c] == 1) {
                    subIslands++ // Found a valid sub-island
                    dfs(grid2, r, c) // Mark the entire island as visited
                }
            }
        }
        return subIslands
    }

    fun countSubIslandsBest(grid1: Array<IntArray>, grid2: Array<IntArray>): Int {
        var count = 0
        for (row in grid2.indices) {
            for (col in grid2[0].indices) {
                if (grid2[row][col] == 1 && dfs(grid1, grid2, row, col)) {
                    count++
                }
            }
        }
        return count
    }

    private fun dfs(grid1: Array<IntArray>, grid2: Array<IntArray>, row: Int, col: Int): Boolean {
        val m = grid1.size
        val n = grid1[0].size
        if (row !in 0..(m - 1) || col !in 0..(n - 1) || grid2[row][col] == 0) return true
        grid2[row][col] = 0
        var result = grid1[row][col] == 1
        result = dfs(grid1, grid2, row + 1, col) && result
        result = dfs(grid1, grid2, row - 1, col) && result
        result = dfs(grid1, grid2, row, col + 1) && result
        result = dfs(grid1, grid2, row, col - 1) && result
        return result
    }
}