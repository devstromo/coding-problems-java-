package com.devstromo.medium.p240

class SolutionKt {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size
        var i = rows - 1
        var j = 0
        while (i >= 0 && j < cols) {
            if (matrix[i][j] < target) j++
            else if (matrix[i][j] > target) {
                i--
            } else return true
        }
        return false
    }

    fun searchMatrixBest(matrix: Array<IntArray>, target: Int): Boolean {
        var r = 0
        var c = matrix[0].size - 1

        while (r <= matrix.size - 1 && c >= 0) {
            when {
                target == matrix[r][c] -> return true
                target < matrix[r][c] -> c--
                else -> r++
            }
        }
        return false
    }

}