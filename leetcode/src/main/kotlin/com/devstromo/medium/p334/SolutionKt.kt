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

    fun increasingTripletBest(nums: IntArray): Boolean {
        if (nums.size <= 2) return false

        var i = Int.MAX_VALUE
        var j = Int.MAX_VALUE

        for (ind in nums.indices) {
            if (nums[ind] <= i) {
                i = nums[ind]
            } else if (nums[ind] <= j) {
                j = nums[ind]
            } else {
                return true
            }
        }
        return false
    }
}