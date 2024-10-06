package com.devstromo.easy.p746

import kotlin.math.min

class SolutionKt {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val n = cost.size
        val dp = IntArray(cost.size)
        dp[0] = cost[0]
        dp[1] = cost[1]
        for (i in 2 until n) {
            dp[i] = min(dp[i - 1], dp[i - 2]) + cost[i]
        }
        return min(dp[n - 1], dp[n - 2])
    }

    fun minCostClimbingStairsNoAdditionalSpace(cost: IntArray): Int {
        val n = cost.size
        var prev1 = cost[1]
        var prev2 = cost[0]

        for (i in 2 until n) {
            val current = min(prev1, prev2) + cost[i]
            prev2 = prev1
            prev1 = current
        }

        return min(prev1, prev2)
    }

    fun minCostClimbingStairsBest(cost: IntArray): Int {
        val n = cost.count()
        val dp = IntArray(n + 1)
        dp[0] = 0
        dp[1] = 0
        for (i in 2..n) {
            dp[i] = min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2])
        }
        return dp[n]
    }
}