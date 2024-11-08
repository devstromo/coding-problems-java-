package com.devstromo.medium.p215

import java.util.*

class SolutionKt {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val n = nums.size
        val pq = PriorityQueue(n, Collections.reverseOrder<Int>())
        for (num in nums) {
            pq.offer(num)
        }
        for (i in 1 until k) {
            pq.poll()
        }
        return pq.peek()
    }

    fun findKthLargestBest(nums: IntArray, k: Int): Int {
        val array: IntArray = IntArray(20001)
        for (i in nums) {
            array[i + 10000]++;
        }
        var kk = k
        for (i in 20000 downTo 0) {
            kk -= array[i]
            if (kk <= 0) {
                return i - 10000
            }
        }
        return -5
    }
}