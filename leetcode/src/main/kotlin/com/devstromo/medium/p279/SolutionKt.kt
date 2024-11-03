package com.devstromo.medium.p279

class SolutionKt {
    fun numSquares(n: Int): Int {
        val squares = mutableListOf<Int>()
        for (i in 1..n) {
            if (i * i > n) break
            squares.add(i * i)
        }
        val dp = IntArray(n + 1) { Int.MAX_VALUE }
        dp[0] = 0
        for (i in 1..n) {
            for (square in squares) {
                if (square <= i) {
                    dp[i] = minOf(dp[i], dp[i - square] + 1)
                } else {
                    break
                }
            }
        }
        return dp[n]
    }

    fun numSquaresBest(n: Int): Int {
        val dp = IntArray(n + 1) { it }
        val sq = IntArray(100) { (it + 1) * (it + 1) }
        for (i in 1..n)
            for (v in sq) {
                if (v > i) break
                dp[i] = minOf(dp[i], 1 + dp[i - v])
            }
        return dp[n]
    }
}