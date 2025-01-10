package com.devstromo.easy.p169

class SolutionKt {

    fun majorityElement(nums: IntArray): Int {
        var candidate = nums[0]
        var count = 0

        for (num in nums) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1
        }

        return candidate
    }
}