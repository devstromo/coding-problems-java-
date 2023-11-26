package com.devstromo.medium.p198

class SolutionKt {
    fun rob(nums: IntArray): Int {
        var last = 0
        var prev = 0
        var current: Int
        for (index in nums.indices) {
            current = (prev + nums[index]).coerceAtLeast(last)
            prev = last
            last = current
        }
        return last;
    }
}