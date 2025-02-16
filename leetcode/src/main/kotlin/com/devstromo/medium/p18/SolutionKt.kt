package com.devstromo.medium.p18

import java.util.*

class SolutionKt {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val res: MutableList<List<Int>> = ArrayList()
        Arrays.sort(nums)

        val n = nums.size
        for (i in 0 until n - 3) {
            if (i > 0 && nums[i] == nums[i - 1]) continue

            for (j in i + 1 until n - 2) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue

                var left = j + 1
                var right = n - 1

                while (left < right) {
                    val sum = nums[i].toLong() + nums[j] + nums[left] + nums[right]

                    if (sum == target.toLong()) {
                        res.add(listOf(nums[i], nums[j], nums[left], nums[right]))

                        while (left < right && nums[left] == nums[left + 1]) left++
                        while (left < right && nums[right] == nums[right - 1]) right--

                        left++
                        right--
                    } else if (sum < target) {
                        left++
                    } else {
                        right--
                    }
                }
            }
        }

        return res
    }

    fun fourSumBest(nums: IntArray, target: Int): List<List<Int>> {
        Arrays.sort(nums)
        return kSum(nums, target.toLong(), 0, 4)
    }

    private fun kSum(nums: IntArray, target: Long, start: Int, k: Int): List<List<Int>> {
        val res: MutableList<MutableList<Int>> = ArrayList()

        // If we have run out of numbers to add, return res.
        if (start == nums.size) {
            return res
        }

        // There are k remaining values to add to the sum. The
        // average of these values is at least target / k.
        val average_value = target / k

        // We cannot obtain a sum of target if the smallest value
        // in nums is greater than target / k or if the largest
        // value in nums is smaller than target / k.
        if (nums[start] > average_value || average_value > nums[nums.size - 1]
        ) {
            return res
        }

        if (k == 2) {
            return twoSum(nums, target, start)
        }

        for (i in start until nums.size) {
            if (i == start || nums[i - 1] != nums[i]) {
                for (subset in kSum(
                    nums,
                    target - nums[i],
                    i + 1,
                    k - 1
                )) {
                    res.add(ArrayList(Arrays.asList(nums[i])))
                    res[res.size - 1].addAll(subset!!)
                }
            }
        }

        return res
    }

    private fun twoSum(nums: IntArray, target: Long, start: Int): List<List<Int>> {
        val res: MutableList<MutableList<Int>> = ArrayList()
        var lo = start
        var hi = nums.size - 1

        while (lo < hi) {
            val currSum = nums[lo] + nums[hi]
            if (currSum < target || (lo > start && nums[lo] == nums[lo - 1])) {
                ++lo
            } else if (currSum > target ||
                (hi < nums.size - 1 && nums[hi] == nums[hi + 1])
            ) {
                --hi
            } else {
                res.add(Arrays.asList(nums[lo++], nums[hi--]))
            }
        }

        return res
    }
}