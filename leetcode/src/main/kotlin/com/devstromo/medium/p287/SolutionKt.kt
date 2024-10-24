package com.devstromo.medium.p287

class SolutionKt {
    fun findDuplicate(nums: IntArray): Int {
        val n = nums.size
        val pre = BooleanArray(n + 1)
        for (i in 0 until n) {
            if (pre[nums[i]]) return nums[i]
            else pre[nums[i]] = true
        }
        return -1
    }
}