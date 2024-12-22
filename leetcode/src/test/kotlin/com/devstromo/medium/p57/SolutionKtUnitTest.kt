package com.devstromo.medium.p57

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Insert Intervals`() {
        assertArrayEquals(
            arrayOf(intArrayOf(1, 5), intArrayOf(6, 9)),
            solution.insert(arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), intArrayOf(2, 5))
        )
        assertArrayEquals(
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(12, 16)), solution.insert(
                arrayOf(
                    intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16)
                ), intArrayOf(4, 8)
            )
        )
        assertArrayEquals(arrayOf(intArrayOf(5, 7)), solution.insert(arrayOf(), intArrayOf(5, 7)))
    }
}