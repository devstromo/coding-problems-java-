package com.devstromo.medium.p81

class SolutionKt {
    fun search(nums: IntArray, target: Int): Boolean {

        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (nums[mid] == target) {
                return true
            }

            if (nums[mid] == nums[right]) {
                right--
            } else if (nums[mid] > nums[right]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }

        return false
    }
}