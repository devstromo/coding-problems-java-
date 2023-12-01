package com.devstromo.medium.p213

import kotlin.math.max

class SolutionKt {
    fun rob(nums: IntArray): Int {
        return if (nums.size == 1) nums[0] else max(
            rob(nums, 0, nums.size - 2).toDouble(),
            rob(nums, 1, nums.size - 1).toDouble()
        ).toInt()
    }

    private fun rob(nums: IntArray, low: Int, high: Int): Int {
        var prev1 = 0
        var prev2 = 0
        for (i in low..high) {
            val curr = max((nums[i] + prev2).toDouble(), prev1.toDouble()).toInt()
            prev2 = prev1
            prev1 = curr
        }
        return prev1
    }
}