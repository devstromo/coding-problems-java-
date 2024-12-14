package com.devstromo.easy.p1991

class SolutionKt {
    fun findMiddleIndex(nums: IntArray): Int {
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
        }

        var leftSum = 0
        for (i in nums.indices) {
            val rightSum = sum - leftSum - nums[i]
            if (leftSum == rightSum) {
                return i
            }
            leftSum += nums[i]
        }
        return -1
    }

    fun findMiddleIndexBest(nums: IntArray): Int {
        var sum = 0
        var leftSum = 0
        for (num in nums) sum += num
        for ((index, num) in nums.withIndex()) {
            if (sum - leftSum - num == leftSum) return index
            leftSum += num
        }
        return -1
    }
}