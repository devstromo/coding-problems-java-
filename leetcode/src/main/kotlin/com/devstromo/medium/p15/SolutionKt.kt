package com.devstromo.medium.p15

import java.util.*

class SolutionKt {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val res: MutableList<List<Int>> = ArrayList()
        Arrays.sort(nums)

        val n = nums.size
        for (i in 0 until n - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            var j = i + 1
            var k = n - 1
            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                if (sum == 0) {
                    res.add(listOf(nums[i], nums[j], nums[k]))
                    while (j < k && nums[j] == nums[j + 1]) j++
                    while (j < k && nums[k] == nums[k - 1]) k--
                    j++
                    k--
                } else if (sum < 0) {
                    j++
                } else {
                    k--
                }
            }
        }

        return res
    }
}