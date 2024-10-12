package com.devstromo.medium.p918

import kotlin.math.max
import kotlin.math.min

class SolutionKt {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var currentMax = 0
        var currentMin = 0
        var maxSum = nums[0]
        var minSum = nums[0]
        var totalSum = 0

        for (num in nums) {
            currentMax = max(currentMax, 0) + num
            maxSum = max(maxSum, currentMax)
            currentMin = min(currentMin, 0) + num
            minSum = min(minSum, currentMin)
            totalSum += num
        }

        if (totalSum == minSum) {
            return maxSum
        }

        return max(maxSum, totalSum - minSum)
    }
}