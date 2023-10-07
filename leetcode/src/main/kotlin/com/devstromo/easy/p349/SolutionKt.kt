package com.devstromo.easy.p349

class SolutionKt {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        return nums1.toSet().intersect(nums2.toSet()).toIntArray();
    }

    fun intersectionBest(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = HashSet<Int>()
        for (value in nums1) {
            set1.add(value)
        }

        val set2 = HashSet<Int>()
        for (value in nums2) {
            if (set1.contains(value)) {
                set2.add(value)
            }
        }

        val intArray = IntArray(set2.size)
        var i = 0
        for (value in set2) {
            intArray[i] = value
            i++
        }
        return intArray
    }

}