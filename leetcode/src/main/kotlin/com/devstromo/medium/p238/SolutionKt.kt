package com.devstromo.medium.p238

class SolutionKt {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val answers = IntArray(n) { 1 }
        var current = 1
        for (i in 0 until n) {
            answers[i] *= current
            current *= nums[i]
        }
        current = 1
        for (i in n - 1 downTo 0) {
            answers[i] *= current
            current *= nums[i]
        }
        return answers
    }
}