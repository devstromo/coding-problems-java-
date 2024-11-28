package com.devstromo.easy.p724

class SolutionKt {
    fun pivotIndex(nums: IntArray): Int {
        var totalSum = 0
        for (num in nums) {
            totalSum += num
        }

        var leftSum = 0
        for (i in nums.indices) {
            val rightSum = totalSum - leftSum - nums[i]
            if (leftSum == rightSum) {
                return i
            }
            leftSum += nums[i]
        }

        return -1
    }
}