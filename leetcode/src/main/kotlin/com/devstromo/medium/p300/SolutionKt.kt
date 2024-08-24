package com.devstromo.medium.p300

import java.util.*
import kotlin.math.abs

class SolutionKt {

    fun lengthOfLIS(nums: IntArray): Int {
        val dp = ArrayList<Int>()
        for (i in nums) {
            var pos = Collections.binarySearch(dp, i)
            pos = if (pos < 0) abs(pos + 1) else pos

            if (pos == dp.size) {
                dp.add(i)
            } else {
                dp[pos] = i
            }
        }
        return dp.size
    }

    fun lengthOfLISBestSolution(nums: IntArray): Int {
        val sub = mutableListOf<Int>()
        for (num in nums) {
            val pos = Collections.binarySearch(sub, num)
            if (pos < 0) {
                val insertPos = -(pos + 1)
                if (insertPos < sub.size) {
                    sub[insertPos] = num
                } else {
                    sub.add(num)
                }
            }
        }
        return sub.size
    }

}