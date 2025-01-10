package com.devstromo.medium.p647

class SolutionKt {

    fun countSubstrings(s: String): Int {
        val n = s.length
        val dp = Array(n) { BooleanArray(n) }
        var count = 0

        for (i in 0..<n) {
            dp[i][i] = true
            count++
        }

        for (i in 0..<n - 1) {
            if (s[i] == s[i + 1]) {
                dp[i][i + 1] = true
                count++
            }
        }

        for (len in 3..n) {
            for (i in 0..n - len) {
                val j = i + len - 1
                if (s[i] == s[j] && dp[i + 1][j - 1]) {
                    dp[i][j] = true
                    count++
                }
            }
        }

        return count
    }
}