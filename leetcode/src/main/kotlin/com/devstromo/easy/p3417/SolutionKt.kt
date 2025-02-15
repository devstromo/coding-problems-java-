package com.devstromo.easy.p3417

class SolutionKt {
    fun zigzagTraversal(grid: Array<IntArray>): List<Int> {
        val result: MutableList<Int> = ArrayList()
        val rows = grid.size
        val cols = grid[0].size
        var leftToRight = true
        var skip = false

        for (r in 0..<rows) {
            if (leftToRight) {
                for (c in 0..<cols) {
                    if (!skip) {
                        result.add(grid[r][c])
                    }
                    skip = !skip // Toggle skip
                }
            } else {
                for (c in cols - 1 downTo 0) {
                    if (!skip) {
                        result.add(grid[r][c])
                    }
                    skip = !skip // Toggle skip
                }
            }
            leftToRight = !leftToRight // Change direction
        }

        return result
    }
}