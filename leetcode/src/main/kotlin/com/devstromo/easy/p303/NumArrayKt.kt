package com.devstromo.easy.p303

class NumArrayKt(nums: IntArray) {
    private val sum: IntArray = IntArray(nums.size + 1)

    init{
        for (i in nums.indices) {
            sum[i + 1] = sum[i] + nums[i]
        }
    }
    fun sumRange(left: Int, right: Int): Int {
        return sum[right + 1] - sum[left]
    }
}