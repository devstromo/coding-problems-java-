package com.devstromo.easy.p283

class SolutionKt {

    fun moveZeroes(nums: IntArray): Unit {
        var position = 0
        for (num in nums) {
            if (num != 0) {
                nums[position++] = num
            }
        }
        while (position < nums.size) {
            nums[position++] = 0
        }
    }
}