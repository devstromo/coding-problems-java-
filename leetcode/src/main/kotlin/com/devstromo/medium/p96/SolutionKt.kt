package com.devstromo.medium.p96

class SolutionKt {
    fun numTrees(n: Int): Int {
        var result: Long = 1
        for (i in 1..n) {
            result = (result * (4L * i - 2)) / (i + 1)
        }
        return result.toInt()
    }
}