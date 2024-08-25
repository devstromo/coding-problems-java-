package com.devstromo.easy.p674

import kotlin.math.max

class SolutionKt {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var max = 1
        var current = 1
        var i = 1
        while (i < nums.size) {
            if (nums[i] > nums[i - 1]) {
                current++
                max = max(max, current)
            } else {
                current = 1
            }
            i++
        }
        return max
    }

    fun findLengthOfLCISBest(nums: IntArray): Int {
        var inc = 1
        var max = 1

        for (i in 1 until nums.size) {
            inc = if (nums[i] > nums[i - 1]) inc + 1 else 1
            max = maxOf(max, inc)
        }

        return max
    }
}