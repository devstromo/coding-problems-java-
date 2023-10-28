package com.devstromo.medium.p322

import java.util.*
import kotlin.math.min

class SolutionKt {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1)
        Arrays.fill(dp, Int.MAX_VALUE - 1)
        dp[0] = 0
        for (i in coins.indices) {
            for (j in coins[i]..amount) {
                if (dp[j - coins[i]] != Int.MAX_VALUE) {
                    dp[j] = min(dp[j].toDouble(), (1 + dp[j - coins[i]]).toDouble()).toInt()
                }
            }
        }
        return if (dp[amount] >= Int.MAX_VALUE - 1) -1 else dp[amount]
    }

    fun coinChangeBest(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1) { amount + 1 }
        dp[0] = 0
        for (i in 1..amount) {
            for (coin in coins) {
                if (i >= coin) {
                    dp[i] = kotlin.math.min(dp[i], dp[i - coin] + 1)
                }
            }
        }
        return if (dp[amount] > amount) -1 else dp[amount]
    }
}