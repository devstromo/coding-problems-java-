package com.devstromo.easy.p628

import kotlin.math.max

class SolutionKt {
    fun maximumProduct(nums: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var max3 = Int.MIN_VALUE
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE
        for (i in nums.indices) {
            if (nums[i] > max3) {
                max1 = max2
                max2 = max3
                max3 = nums[i]
            } else if (nums[i] > max2) {
                max1 = max2
                max2 = nums[i]
            } else if (nums[i] > max1) {
                max1 = nums[i]
            }

            if (nums[i] < min1) {
                min2 = min1
                min1 = nums[i]
            } else if (nums[i] < min2) {
                min2 = nums[i]
            }
        }
        return max(max1 * max2 * max3, max3 * min1 * min2)
    }
}