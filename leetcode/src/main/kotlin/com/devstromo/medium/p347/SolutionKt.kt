package com.devstromo.medium.p347

class SolutionKt {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        if (k == nums.size) {
            return nums
        }

        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE

        for (num in nums) {
            if (num > max) max = num
            if (num < min) min = num
        }

        val freq = IntArray(max - min + 1)
        for (num in nums) {
            freq[num - min]++
        }

        val bucket = Array<MutableList<Int>?>(nums.size + 1) { null }
        var maxFreq = 0
        for (i in freq.indices) {
            if (freq[i] > 0) {
                if (bucket[freq[i]] == null) {
                    bucket[freq[i]] = mutableListOf()
                }
                bucket[freq[i]]!!.add(i + min)
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i]
                }
            }
        }

        val result = IntArray(k)
        var index = 0
        for (j in maxFreq downTo 0) {
            if (bucket[j] != null) {
                for (num in bucket[j]!!) {
                    if (index == k) break
                    result[index++] = num
                }
            }
        }

        return result
    }
}