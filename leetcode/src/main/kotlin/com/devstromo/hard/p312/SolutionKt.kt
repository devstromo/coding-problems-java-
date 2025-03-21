package com.devstromo.hard.p312

import kotlin.math.max

class SolutionKt {
    fun maxCoins(nums: IntArray): Int {
        val n = nums.size
        val newNums = IntArray(n + 2)
        newNums[0] = 1.also { newNums[n + 1] = it }
        System.arraycopy(nums, 0, newNums, 1, n)

        val dp = Array(n + 2) { IntArray(n + 2) }

        for (len in 2..n + 1) {
            for (left in 0..n + 1 - len) {
                val right = left + len
                for (i in left + 1..<right) {
                    dp[left][right] = max(
                        dp[left][right],
                        newNums[left] * newNums[i] * newNums[right] + dp[left][i] + dp[i][right]
                    )
                }
            }
        }

        return dp[0][n + 1]
    }
}