package com.devstromo.easy.p136

class SolutionKt {
    fun singleNumber(nums: IntArray): Int {
        if (nums.size == 1)
            return nums[0];
        nums.sort()
        var i = 0
        while (i < nums.size - 1) {
            if (i == 0 && nums[i] != nums[i + 1]) {
                return nums[i]
            } else if (i > 0 && nums[i - 1] != nums[i] && nums[i] != nums[i + 1])
                return nums[i]
            i++
        }
        return nums[nums.size - 1]
    }

    fun singleNumberBest(nums: IntArray): Int {
        val mutableList = mutableListOf<Int>()
        for (num in nums) {
            if (num !in mutableList) {
                mutableList.add(num)
            } else {
                mutableList.remove(num)
            }
        }
        return mutableList[0]
    }
}