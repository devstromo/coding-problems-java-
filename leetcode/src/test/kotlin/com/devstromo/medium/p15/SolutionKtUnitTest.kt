package com.devstromo.medium.p15

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Three Sum`() {
        assertEquals(
            listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), solution.threeSum(
                intArrayOf(-1, 0, 1, 2, -1, -4)
            )
        )
        assertEquals(listOf<List<Int>>(), solution.threeSum(intArrayOf(0, 1, 1)))
        assertEquals(listOf(listOf(0, 0, 0)), solution.threeSum(intArrayOf(0, 0, 0)))
    }
}