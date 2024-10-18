package com.devstromo.medium.p152

import kotlin.math.max
import kotlin.math.min

class SolutionKt {
    fun maxProduct(nums: IntArray): Int {
        val n = nums.size
        var maxProduct = nums[0]
        var currentMax = nums[0]
        var currentMin = nums[0]

        for (i in 1 until n) {
            if (nums[i] < 0) {
                val temp = currentMax
                currentMax = currentMin
                currentMin = temp
            }

            currentMax = max(nums[i], nums[i] * currentMax)
            currentMin = min(nums[i], nums[i] * currentMin)

            maxProduct = max(maxProduct, currentMax)
        }

        return maxProduct
    }
}