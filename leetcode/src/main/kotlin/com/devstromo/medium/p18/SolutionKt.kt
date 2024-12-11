package com.devstromo.medium.p18

import java.util.*

class SolutionKt {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val res: MutableList<List<Int>> = ArrayList()
        Arrays.sort(nums)

        val n = nums.size
        for (i in 0 until n - 3) {
            if (i > 0 && nums[i] == nums[i - 1]) continue

            for (j in i + 1 until n - 2) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue

                var left = j + 1
                var right = n - 1

                while (left < right) {
                    val sum = nums[i].toLong() + nums[j] + nums[left] + nums[right]

                    if (sum == target.toLong()) {
                        res.add(listOf(nums[i], nums[j], nums[left], nums[right]))

                        while (left < right && nums[left] == nums[left + 1]) left++
                        while (left < right && nums[right] == nums[right - 1]) right--

                        left++
                        right--
                    } else if (sum < target) {
                        left++
                    } else {
                        right--
                    }
                }
            }
        }

        return res
    }
}