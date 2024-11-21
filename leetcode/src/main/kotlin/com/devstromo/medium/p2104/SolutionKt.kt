package com.devstromo.medium.p2104

class SolutionKt {
    fun subArrayRanges(nums: IntArray): Long {
        var sum: Long = 0
        val n = nums.size

        for (i in 0 until n) {
            var left = i
            var right = i
            while (left > 0 && nums[left - 1] <= nums[i]) left--
            while (right < n - 1 && nums[right + 1] < nums[i]) right++

            sum += (nums[i] * (right - i + 1).toLong() * (i - left + 1).toLong())

            left = i
            right = i
            while (left > 0 && nums[left - 1] >= nums[i]) left--
            while (right < n - 1 && nums[right + 1] > nums[i]) right++

            sum -= (nums[i] * (right - i + 1).toLong() * (i - left + 1).toLong())
        }

        return sum
    }
}