package com.devstromo.medium.p74

class SolutionKt {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val n = matrix.size
        val m = matrix[0].size
        var row = 0
        var column = m - 1
        while (row < n && column >= 0) {
            if (matrix[row][column] == target) {
                return true
            } else if (matrix[row][column] < target) {
                row++
            } else {
                column--
            }
        }
        return false
    }
}