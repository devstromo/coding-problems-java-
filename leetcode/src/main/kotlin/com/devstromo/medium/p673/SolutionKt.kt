package com.devstromo.medium.p673

import java.util.*
import kotlin.math.max

class SolutionKt {
    fun findNumberOfLIS(nums: IntArray): Int {
        val n = nums.size
        if (n == 0) return 0
        if (n == 1) return 1
        val lis = IntArray(n)
        val count = IntArray(n)
        var max = Int.MIN_VALUE
        Arrays.fill(lis, 1)
        Arrays.fill(count, 1)
        for (i in 1 until n) {
            for (j in 0 until i) {
                if (nums[j] < nums[i]) {
                    if (lis[j] + 1 > lis[i]) {
                        lis[i] = lis[j] + 1
                        count[i] = count[j]
                    } else if (lis[j] + 1 == lis[i]) {
                        count[i] += count[j]
                    }
                }
            }
            max = max(max, lis[i])
        }
        var result = 0
        for (i in 0 until n) {
            if (lis[i] == max) {
                result += count[i]
            }
        }
        return result
    }

}