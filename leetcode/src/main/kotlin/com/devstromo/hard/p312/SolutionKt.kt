package com.devstromo.hard.p312

import kotlin.math.max

class SolutionKt {
    fun maxCoins(nums: IntArray): Int {
        val n = nums.size
        val newNums = IntArray(n + 2)
        newNums[0] = 1.also { newNums[n + 1] = it }
        System.arraycopy(nums, 0, newNums, 1, n)

        val dp = Array(n + 2) { IntArray(n + 2) }

        for (len in 2..n + 1) {
            for (left in 0..n + 1 - len) {
                val right = left + len
                for (i in left + 1..<right) {
                    dp[left][right] = max(
                        dp[left][right],
                        newNums[left] * newNums[i] * newNums[right] + dp[left][i] + dp[i][right]
                    )
                }
            }
        }

        return dp[0][n + 1]
    }

    fun maxCoinsBest(nums: IntArray): Int {
        val n = nums.size
        val memoization = Array(n) { IntArray(n) }

        fun get(i: Int) = when (i) {
            -1, n -> 1
            else -> nums[i]
        }

        for (i in nums.indices) {
            memoization[i][i] = get(i - 1) * nums[i] * get(i + 1)
        }

        for (l in 1 until n) {
            var i = 0
            var j = l
            while (j < n) {
                val p = get(i - 1) * get(j + 1)
                var t = max(
                    p * nums[i] + memoization[i + 1][j],
                    p * nums[j] + memoization[i][j - 1],
                )
                var k = i + 1
                while (k < j) {
                    t = max(t, memoization[i][k - 1] + memoization[k + 1][j] + p * nums[k])
                    k++
                }
                memoization[i][j] = t
                i++
                j++
            }
        }

        return memoization[0][n - 1]
    }
}