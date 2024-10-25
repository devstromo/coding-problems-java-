package com.devstromo.medium.p794

import kotlin.math.abs

class SolutionKt {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        var sum = 0
        for (num in nums) {
            sum += num
        }
        if ((target + sum) % 2 != 0 || sum < abs(target)) {
            return 0
        }
        val targetSum = (target + sum) / 2
        val dp = IntArray(targetSum + 1)
        dp[0] = 1
        for (num in nums) {
            for (j in targetSum downTo num) {
                dp[j] += dp[j - num]
            }
        }
        return dp[targetSum]
    }
}