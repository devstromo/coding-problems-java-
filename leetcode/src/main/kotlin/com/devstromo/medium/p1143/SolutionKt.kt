package com.devstromo.medium.p1143

import kotlin.math.max

class SolutionKt {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val n: Int = text1.length
        val m: Int = text2.length
        val dp = Array(n + 1) { IntArray(m + 1) }

        for (i in 1..n) {
            for (j in 1..m) {
                if (text1[i - 1] == text2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1
                } else {
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
                }
            }
        }

        return dp[n][m]
    }
}