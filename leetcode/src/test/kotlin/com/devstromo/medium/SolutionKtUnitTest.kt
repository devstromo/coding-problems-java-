package com.devstromo.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun testFindLongestChain() {
        val nums = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(3, 4)
        )
        assertEquals(2, solution.findLongestChain(nums))

        val nums2 = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(7, 8),
            intArrayOf(4, 5)
        )
        assertEquals(3, solution.findLongestChain(nums2))
    }
}