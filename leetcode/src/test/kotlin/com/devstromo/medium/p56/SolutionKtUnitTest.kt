package com.devstromo.medium.p56

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Merge`() {
        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)
            ), solution.merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
        )
        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 5)
            ), solution.merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)))
        )
    }

    @Test
    fun `Test Merge Best Solution`() {
        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)
            ), solution.mergeBest(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
        )
        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 5)
            ), solution.mergeBest(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)))
        )
    }
}