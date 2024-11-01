package com.devstromo.medium.p518

class SolutionKt {
    fun change(amount: Int, coins: IntArray): Int {
        val n = coins.size
        val dp = Array(n + 1) { IntArray(amount + 1) }

        for (i in 0..n) {
            dp[i][0] = 1
        }

        for (i in 1..n) {
            for (j in 1..amount) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j]
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]]
                }
            }
        }
        return dp[n][amount]
    }

    fun changeBest(amount: Int, coins: IntArray): Int {
        val dp = IntArray(amount + 1)
        dp[0] = 1
        for (c in coins) {
            for (i in c..amount) {
                dp[i] += dp[i - c]
            }
        }
        return dp[amount]
    }

}