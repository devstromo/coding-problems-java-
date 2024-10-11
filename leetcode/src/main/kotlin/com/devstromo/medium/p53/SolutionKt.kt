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

    fun maxSubArrayBest(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var curr = 0
        for (n in nums) {
            curr += n
            if (curr > max) {
                max = curr
            }
            if (curr < 0) {
                curr = 0
            }
        }
        return max
    }
}