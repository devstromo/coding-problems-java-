package com.devstromo.medium.p1034

class SolutionKt {
    private val directions = arrayOf(
        intArrayOf(-1, 0), intArrayOf(1, 0),
        intArrayOf(0, -1), intArrayOf(0, 1)
    )
    private lateinit var visited: Array<BooleanArray>
    private var originalColor = 0

    fun colorBorder(grid: Array<IntArray>, row: Int, col: Int, color: Int): Array<IntArray> {
        val m = grid.size
        val n = grid[0].size
        visited = Array(m) { BooleanArray(n) }
        originalColor = grid[row][col]

        // Store border cells that need to be colored
        val borderCells = mutableListOf<Pair<Int, Int>>()

        // DFS to find connected component and mark border cells
        dfs(grid, row, col, borderCells)

        // Color the border cells
        for ((r, c) in borderCells) {
            grid[r][c] = color
        }

        return grid
    }

    private fun dfs(grid: Array<IntArray>, r: Int, c: Int, borderCells: MutableList<Pair<Int, Int>>) {
        val m = grid.size
        val n = grid[0].size
        visited[r][c] = true
        var isBorder = false

        for (dir in directions) {
            val newRow = r + dir[0]
            val newCol = c + dir[1]

            if (newRow !in 0 until m || newCol !in 0 until n || grid[newRow][newCol] != originalColor) {
                isBorder = true // It's a border if it touches an out-of-boundary or different color cell
            } else if (!visited[newRow][newCol]) {
                dfs(grid, newRow, newCol, borderCells)
            }
        }

        if (isBorder) {
            borderCells.add(Pair(r, c))
        }
    }
}