package com.devstromo.medium.p1696

class SolutionKt {
    fun maxResult(nums: IntArray, k: Int): Int {
        val n = nums.size
        val dp = IntArray(n)
        dp[n - 1] = nums[n - 1]
        var index = n - 1
        for (i in n - 2 downTo 0) {
            if (index > i + k) {
                index = i + 1
                var j = i + 2
                while (j <= i + k && j <= n - 1) {
                    if (dp[j] > dp[index]) {
                        index = j
                    }
                    j++
                }
            }

            dp[i] = nums[i] + dp[index]
            if (dp[i] > dp[index]) {
                index = i
            }
        }
        return dp[0]
    }
}