package com.devstromo.easy.p496

class SolutionKt {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val map = IntArray(10001)
        val result = IntArray(nums1.size)
        for (i in nums2.indices) map[nums2[i]] = i
        for (i in nums1.indices) result[i] = greater(map[nums1[i]], nums2)
        return result
    }

    private fun greater(index: Int, nums2: IntArray): Int {
        for (j in index + 1 until nums2.size) {
            if (nums2[j] > nums2[index]) return nums2[j]
        }
        return -1
    }

}