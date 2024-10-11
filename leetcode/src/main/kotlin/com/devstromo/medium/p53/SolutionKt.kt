package com.devstromo.medium.p53

class SolutionKt {
    fun maxSubArray(nums: IntArray): Int {
        var current = 0;
        var max = nums[0];
        for (i in nums.indices) {
            current += nums[i]
            max = if (current > max) current else max
            if (current < 0) {
                current = 0;
            }
        }
        return max;
    }
}