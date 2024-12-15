package com.devstromo.easy.p2395

class SolutionKt {
    fun findSubarrays(nums: IntArray): Boolean {
        if (nums.size < 2) return false
        val set = HashSet<Int>()
        for (i in 1 until nums.size) {
            if (set.contains(nums[i] + nums[i - 1])) {
                return true
            }
            set.add(nums[i] + nums[i - 1])
        }
        return false
    }
}