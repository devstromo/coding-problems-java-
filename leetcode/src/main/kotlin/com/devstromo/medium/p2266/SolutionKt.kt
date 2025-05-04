package com.devstromo.medium.p2266

class SolutionKt {
    private val mod = 1_000_000_007

    fun countTexts(pressedKeys: String): Int {
        val n = pressedKeys.length
        val dp = IntArray(n + 1)
        dp[0] = 1

        for (i in 1..n) {
            val currentChar = pressedKeys[i - 1]
            val maxPress = if (currentChar == '7' || currentChar == '9') 4 else 3

            for (j in 1..maxPress) {
                if (i - j < 0) break
                if (pressedKeys[i - j] != currentChar) break
                dp[i] = (dp[i] + dp[i - j]) % mod
            }
        }

        return dp[n]
    }
}