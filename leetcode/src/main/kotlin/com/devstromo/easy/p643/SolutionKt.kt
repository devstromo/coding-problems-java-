package com.devstromo.easy.p643

import kotlin.math.max

class SolutionKt {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        val n = nums.size
        var windowSum = 0.0
        for (i in 0 until k) {
            windowSum += nums[i]
        }
        var maxAvg = windowSum / k
        for (i in k until n) {
            windowSum += (nums[i] - nums[i - k])
            maxAvg = max(maxAvg, windowSum / k)
        }

        return maxAvg
    }
}