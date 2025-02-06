package com.devstromo.medium.p994

class SolutionKt {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val queue = ArrayDeque<Pair<Int, Int>>() // Kotlin-native queue
        var fresh = 0
        var time = 0

        // Step 1: Find all rotten oranges and count fresh oranges
        for (r in 0 until rows) {
            for (c in 0 until cols) {
                when (grid[r][c]) {
                    1 -> fresh++
                    2 -> queue.add(r to c) // Use Kotlin Pair instead of IntArray
                }
            }
        }

        // Directions array for moving in 4 directions
        val directions = arrayOf(
            0 to 1, 0 to -1, 1 to 0, -1 to 0
        )

        // Step 2: BFS traversal (Multi-source BFS)
        while (queue.isNotEmpty() && fresh > 0) {
            repeat(queue.size) {
                val (r, c) = queue.removeFirst() // Dequeue

                for ((dr, dc) in directions) {
                    val row = r + dr
                    val col = c + dc

                    // Check if the new cell is within bounds and is a fresh orange
                    if (row in 0 until rows && col in 0 until cols && grid[row][col] == 1) {
                        grid[row][col] = 2
                        queue.add(row to col) // Kotlin Pair instead of intArrayOf(row, col)
                        fresh--
                    }
                }
            }
            time++
        }

        // Step 3: If fresh oranges remain, return -1, otherwise return the time taken
        return if (fresh == 0) time else -1
    }
}