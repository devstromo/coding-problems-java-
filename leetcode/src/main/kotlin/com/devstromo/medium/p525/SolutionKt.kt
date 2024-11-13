package com.devstromo.medium.p525

class SolutionKt {

    fun findMaxLength(nums: IntArray): Int {
        val n = nums.size
        val prefixSumIndex = IntArray(2 * n + 1) { -2 }
        prefixSumIndex[n] = -1

        var maxLength = 0
        var prefixSum = 0

        for (i in nums.indices) {
            prefixSum += if (nums[i] == 0) -1 else 1

            val adjustedIndex = prefixSum + n

            if (prefixSumIndex[adjustedIndex] >= -1) {
                maxLength = maxOf(maxLength, i - prefixSumIndex[adjustedIndex])
            } else {
                prefixSumIndex[adjustedIndex] = i
            }
        }

        return maxLength
    }
}