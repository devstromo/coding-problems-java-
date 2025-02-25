package com.devstromo.medium.p695

import kotlin.math.max

class SolutionKt {
    var r = 0
    var c = 0
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        var result = 0
        r = grid.size
        c = grid[0].size
        fun dfs(i: Int, j: Int, grid: Array<IntArray>): Int {
            if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] != 1) return 0
            grid[i][j] = -1

            return 1 + dfs(i + 1, j, grid) + dfs(i - 1, j, grid) + dfs(i, j + 1, grid) + dfs(i, j - 1, grid)
        }
        for (i in 0 until r) {
            for (j in 0 until c) {
                if (grid[i][j] == 1) {
                    result = max(result, dfs(i, j, grid))
                }
            }
        }
        return result
    }
}