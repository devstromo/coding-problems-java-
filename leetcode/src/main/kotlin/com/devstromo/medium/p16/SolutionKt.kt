package com.devstromo.medium.p16

import java.util.*
import kotlin.math.abs

class SolutionKt {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        Arrays.sort(nums)
        var closestSum = Int.MAX_VALUE

        for (i in 0 until nums.size - 2) {
            var left = i + 1
            var right = nums.size - 1

            while (left < right) {
                val currentSum = nums[i] + nums[left] + nums[right]

                if (abs(currentSum - target) < abs(closestSum - target)) {
                    closestSum = currentSum
                }

                if (currentSum < target) {
                    left++
                } else if (currentSum > target) {
                    right--
                } else {
                    return target
                }
            }
        }

        return closestSum
    }
}