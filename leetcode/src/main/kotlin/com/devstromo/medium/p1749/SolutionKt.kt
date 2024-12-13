package com.devstromo.medium.p1749

import kotlin.math.abs
import kotlin.math.max

class SolutionKt {
    fun maxAbsoluteSum(nums: IntArray): Int {
        var max = 0
        var min = 0
        var sum = 0
        for (num in nums) {
            if (sum < 0) {
                sum = 0
            }
            sum += num
            if (sum > max) {
                max = sum
            }
        }
        sum = 0
        for (num in nums) {
            if (sum > 0) {
                sum = 0
            }
            sum += num
            if (sum < min) {
                min = sum
            }
        }
        return max(max, abs(min))
    }
}