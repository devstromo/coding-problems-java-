package com.devstromo.medium.p2770

import java.util.*
import kotlin.math.abs
import kotlin.math.max

class SolutionKt {
    fun maximumJumps(nums: IntArray, target: Int): Int {
        val n = nums.size
        val dp = IntArray(n)
        Arrays.fill(dp, -1)
        dp[0] = 0
        for (i in 0 until n) {
            if (dp[i] != -1) {
                for (j in i + 1 until n) {
                    val range = abs(nums[j] - nums[i])
                    if (range <= target) {
                        dp[j] = max(dp[j], (dp[i] + 1))
                    }
                }
            }
        }
        return dp[n - 1]
    }
}