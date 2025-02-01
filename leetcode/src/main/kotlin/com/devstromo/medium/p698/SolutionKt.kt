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

    fun canPartitionKSubsetsBest(nums: IntArray, k: Int): Boolean {
        val total = nums.sum()
        if (total % k != 0) return false
        val target = total / k

        // Sort in descending order for better pruning
        nums.sortDescending()

        // Used array for tracking which numbers have been used
        val used = BooleanArray(nums.size)

        // Optimize by tracking current sum for each subset
        fun backtrack(index: Int, count: Int, currentSum: Int): Boolean {
            // All subsets found
            if (count == k - 1) return true

            // Current subset complete, start new subset
            if (currentSum == target) {
                return backtrack(0, count + 1, 0)
            }

            // Try each number for current subset
            for (i in index until nums.size) {
                // Skip if number is used or would exceed target
                if (used[i] || currentSum + nums[i] > target) continue

                // Skip duplicates to avoid redundant paths
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue

                used[i] = true
                if (backtrack(i + 1, count, currentSum + nums[i])) {
                    return true
                }
                used[i] = false

                // If this is the start of a subset and it fails,
                // remaining attempts will also fail
                if (currentSum == 0) break
            }

            return false
        }

        return backtrack(0, 0, 0)
    }
}