package com.devstromo.medium.p583

import kotlin.math.max

class SolutionKt {
    fun minDistance(word1: String, word2: String): Int {
        val n = word1.length
        val m = word2.length
        val dp = Array(n + 1) { IntArray(m + 1) }
        for (i in 1..n) {
            for (j in 1 .. m) {
                if (word1[i - 1] == word2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]
                } else {
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
                }
            }
        }
        return n - dp[n][m] + m - dp[n][m]
    }
}