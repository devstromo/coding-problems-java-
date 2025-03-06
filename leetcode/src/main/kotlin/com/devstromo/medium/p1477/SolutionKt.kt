package com.devstromo.medium.p1477

import java.util.*
import kotlin.math.min

class SolutionKt {
    fun minSumOfLengths(arr: IntArray, target: Int): Int {
        val n = arr.size
        val dp = IntArray(n)
        Arrays.fill(dp, Int.MAX_VALUE) // Stores min length of subarray ending at index i

        var minLen = Int.MAX_VALUE
        var leftMin = Int.MAX_VALUE // Best length of first subarray found so far
        var left = 0
        var sum = 0
        // Step 1: Sliding window to find subarrays with sum = target
        for (right in 0..<n) {
            sum += arr[right]

            // Shrink window from left if sum exceeds target
            while (sum > target) {
                sum -= arr[left++]
            }

            // If we find a valid subarray
            if (sum == target) {
                val curLen = right - left + 1
                if (left > 0 && dp[left - 1] != Int.MAX_VALUE) {
                    minLen = min(minLen, (curLen + dp[left - 1])) // Min sum of lengths
                }
                leftMin = min(leftMin, curLen) // Update best left subarray
            }

            dp[right] = leftMin // Store min length up to index right
        }

        return if (minLen == Int.MAX_VALUE) -1 else minLen
    }
}