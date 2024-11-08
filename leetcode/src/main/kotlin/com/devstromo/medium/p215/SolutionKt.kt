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
}