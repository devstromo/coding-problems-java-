package com.devstromo.medium.p347

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun testTopKFrequent() {
        assertArrayEquals(intArrayOf(1, 2), solution.topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2))
        assertArrayEquals(intArrayOf(1), solution.topKFrequent(intArrayOf(1), 1))
    }
}