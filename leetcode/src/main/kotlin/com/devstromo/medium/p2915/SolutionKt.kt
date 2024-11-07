package com.devstromo.medium.p2915

import java.util.*
import kotlin.math.max

class SolutionKt {
    fun lengthOfLongestSubsequence(nums: List<Int>, target: Int): Int {
        val dp = IntArray(target + 1)
        Arrays.fill(dp, -1)
        dp[0] = 0

        for (num in nums) {
            for (i in target downTo num) {
                if (dp[i - num] != -1) {
                    dp[i] = max(dp[i], dp[i - num] + 1)
                }
            }
        }

        return dp[target]
    }
}