package com.devstromo.medium.p506

class SolutionKt {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var sum = 0
        val prefixSumCount = mutableMapOf<Int, Int>()
        prefixSumCount[0] = 1
        for (i in nums.indices) {
            sum += nums[i]
            if (prefixSumCount[sum - k] != null) {
                count += prefixSumCount[sum - k]!!
            }
            prefixSumCount[sum] = prefixSumCount.getOrDefault(sum, 0) + 1
        }
        return count
    }

    fun subarraySumBestSolution(nums: IntArray, k: Int): Int {
        val sumMap = HashMap<Int, Int>()
        sumMap[0] = 1
        var sum = 0
        var count = 0
        nums.forEach {
            sum += it
            count += sumMap.getOrDefault(sum - k, 0)
            sumMap[sum] = sumMap.getOrDefault(sum, 0) + 1
        }
        return count
    }

}