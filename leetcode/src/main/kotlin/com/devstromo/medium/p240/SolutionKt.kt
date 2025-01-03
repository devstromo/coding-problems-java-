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

}