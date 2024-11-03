package com.devstromo.medium.p503

class SolutionKt {
    fun nextGreaterElements(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        val stack = IntArray(nums.size)
        var top = -1

        for (i in 0 until 2 * nums.size - 1) {
            while (top > -1 && nums[stack[top]] < nums[i % nums.size]) {
                result[stack[top--]] = nums[i % nums.size]
            }
            if (i < nums.size) {
                stack[++top] = i
            }
        }
        while (top > -1) {
            result[stack[top--]] = -1
        }
        return result
    }
}