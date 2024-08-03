package com.devstromo.medium.p45

import kotlin.math.max

class SolutionKt {
    fun jump(nums: IntArray): Int {
        val n = nums.size
        if (n <= 1) return 0
        if (nums[0] >= n - 1) return 1
        if (nums[0] == 0) return -1
        var maxReach = nums[0]
        var step = nums[0]
        var jumps = 1
        var i = 1
        while (i < n) {
            if (i == n - 1) return -1
            if (nums[i] >= (n - 1) - i) return jumps + 1
            maxReach = max(maxReach, i + nums[i])
            step--
            if (step == 0) {
                jumps++
                if (i >= maxReach) return -1
                step = maxReach - i
            }
            i++
        }
        return -1
    }
}