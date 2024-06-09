package com.devstromo.medium.p416

class SolutionKt {
    fun canPartition(nums: IntArray): Boolean {
        val n = nums.size
        var sum = 0;
        for (i in 0 until n) {
            sum += nums[i]
        }
        return sum % 2 == 0 && isSumSubset(nums, sum / 2, n)
    }

    private fun isSumSubset(numbers: IntArray, sum: Int, n: Int): Boolean {
        val dp = IntArray(sum + 1)
        dp[0] = 1

        for (i in 0 until n) {
            for (j in sum downTo numbers[i]) {
                if (dp[j - numbers[i]] == 1) dp[j] = 1
            }
        }
        return dp[sum] == 1
    }
}