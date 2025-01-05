package com.devstromo.medium.p334

class SolutionKt {
    fun increasingTriplet(nums: IntArray): Boolean {
        if (nums.size < 3) return false

        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE

        for (num in nums) {
            if (num <= first) {
                first = num
            } else if (num <= second) {
                second = num
            } else {
                return true
            }
        }

        return false
    }
}