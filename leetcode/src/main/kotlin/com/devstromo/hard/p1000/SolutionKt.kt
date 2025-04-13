package com.devstromo.hard.p1000

class SolutionKt {

    fun mergeStones(stones: IntArray, k: Int): Int {
        val n = stones.size
        if ((n - 1) % (k - 1) != 0) return -1

        val prefixSum = IntArray(n + 1)
        for (i in stones.indices) {
            prefixSum[i + 1] = prefixSum[i] + stones[i]
        }

        val dp = Array(n) { Array(n) { IntArray(k + 1) { Int.MAX_VALUE } } }

        for (i in 0 until n) {
            dp[i][i][1] = 0
        }

        for (length in 2..n) {
            for (i in 0..n - length) {
                val j = i + length - 1
                for (p in 2..k) {
                    for (m in i until j step (k - 1)) {
                        if (dp[i][m][1] != Int.MAX_VALUE && dp[m + 1][j][p - 1] != Int.MAX_VALUE) {
                            dp[i][j][p] = minOf(dp[i][j][p], dp[i][m][1] + dp[m + 1][j][p - 1])
                        }
                    }
                }
                // Merge into 1 pile
                if (dp[i][j][k] != Int.MAX_VALUE) {
                    dp[i][j][1] = dp[i][j][k] + prefixSum[j + 1] - prefixSum[i]
                }
            }
        }

        return dp[0][n - 1][1]
    }
}