package com.devstromo.medium.p698

import java.util.*

class SolutionKt {
    fun canPartitionKSubsets(nums: IntArray, k: Int): Boolean {
        val sum = Arrays.stream(nums).sum()

        if (sum % k != 0) return false

        val target = sum / k
        Arrays.sort(nums)
        val n = nums.size
        val used = BooleanArray(n)

        return backtrack(nums, used, k, 0, 0, target)
    }

    private fun backtrack(
        nums: IntArray,
        used: BooleanArray,
        k: Int,
        startIdx: Int,
        currSum: Int,
        target: Int
    ): Boolean {
        if (k == 0) return true

        if (currSum == target) return backtrack(nums, used, k - 1, 0, 0, target)


        for (i in startIdx..<nums.size) {
            if (used[i] || currSum + nums[i] > target) continue

            used[i] = true

            if (backtrack(nums, used, k, i + 1, currSum + nums[i], target)) return true

            used[i] = false

            if (currSum == 0) return false
        }
        return false
    }
}