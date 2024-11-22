package com.devstromo.easy.p697

import kotlin.math.min

class SolutionKt {
    fun findShortestSubArray(nums: IntArray): Int {
        var max = -1
        for (i in nums.indices) if (nums[i] > max) max = nums[i]
        val minmax = arrayOfNulls<MinMax>(max + 1)
        var maxFreq = 0
        for (i in nums.indices) {
            if (minmax[nums[i]] == null) minmax[nums[i]] = MinMax(i)
            minmax[nums[i]]!!.max = i
            minmax[nums[i]]!!.count++

            if (minmax[nums[i]]!!.count > maxFreq) maxFreq = minmax[nums[i]]!!.count
        }
        var minLength = Int.MAX_VALUE
        for (i in minmax.indices) {
            if (minmax[i] != null && minmax[i]!!.count == maxFreq)
                minLength = min(minLength, minmax[i]!!.max - minmax[i]!!.min + 1)
        }
        return minLength
    }

    class MinMax(var min: Int) {
        var count: Int = 0
        var max: Int = min
    }
}