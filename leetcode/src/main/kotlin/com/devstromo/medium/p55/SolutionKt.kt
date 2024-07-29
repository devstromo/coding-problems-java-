package com.devstromo.medium.p55

import kotlin.math.max

class SolutionKt {
    fun canJump(nums: IntArray): Boolean {
        var maxValue = 0
        for (i in nums.indices) {
            if (i > maxValue) {
                return false
            }
            maxValue = max(maxValue, i + nums[i])
        }
        return true
    }
}