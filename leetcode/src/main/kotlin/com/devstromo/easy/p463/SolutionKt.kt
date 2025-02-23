package com.devstromo.easy.p463

class SolutionKt {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var perimeter = 0

        for (r in 0..<rows) {
            for (c in 0..<cols) {
                if (grid[r][c] == 1) {
                    perimeter += 4

                    // Check if the cell above is land, reduce perimeter by 2 (shared edge)
                    if (r > 0 && grid[r - 1][c] == 1) {
                        perimeter -= 2
                    }

                    // Check if the cell to the left is land, reduce perimeter by 2 (shared edge)
                    if (c > 0 && grid[r][c - 1] == 1) {
                        perimeter -= 2
                    }
                }
            }
        }

        return perimeter
    }
}