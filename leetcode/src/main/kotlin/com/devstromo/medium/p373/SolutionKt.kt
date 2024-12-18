package com.devstromo.medium.p373

import java.util.*


class SolutionKt {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        val pq = PriorityQueue(compareBy<IntArray> { it[0] + it[1] })

        for (i in 0 until nums1.size.coerceAtMost(k)) {
            pq.offer(intArrayOf(nums1[i], nums2[0], 0))
        }

        var remaining = k
        while (remaining-- > 0 && pq.isNotEmpty()) {
            val cur = pq.poll()
            result.add(listOf(cur[0], cur[1]))

            val nextIndex = cur[2] + 1
            if (nextIndex < nums2.size) {
                pq.offer(intArrayOf(cur[0], nums2[nextIndex], nextIndex))
            }
        }

        return result
    }
}