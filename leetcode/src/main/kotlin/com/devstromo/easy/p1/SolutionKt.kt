package com.devstromo.easy.p1

import java.util.HashMap

class SolutionKt {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        var first = 0
        var second = 0
        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                first = map[target - nums[i]]!!
                second = i
                break
            }
            map[nums[i]] = i
        }
        return intArrayOf(first, second)
    }
}