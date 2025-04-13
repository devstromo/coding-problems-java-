package com.devstromo.medium.p1727

class SolutionKt {
    fun largestSubmatrix(matrix: Array<IntArray>): Int {
        val rows = matrix.size
        val cols = matrix[0].size
        var maxArea = 0

        // Step 1: Accumulate heights of 1s
        for (r in 1 until rows) {
            for (c in 0 until cols) {
                if (matrix[r][c] == 1) {
                    matrix[r][c] += matrix[r - 1][c]
                }
            }
        }

        // Step 2: For each row, sort heights in descending order to maximize area
        for (r in 0 until rows) {
            val sortedRow = matrix[r].sortedDescending()
            for (c in 0 until cols) {
                maxArea = maxOf(maxArea, sortedRow[c] * (c + 1))
            }
        }

        return maxArea
    }
}