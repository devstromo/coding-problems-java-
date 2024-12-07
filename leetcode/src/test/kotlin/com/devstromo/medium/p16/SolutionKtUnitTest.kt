package com.devstromo.medium.p16

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Three Sum Closet`() {
        assertEquals(2, solution.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1))
        assertEquals(0, solution.threeSumClosest(intArrayOf(0, 0, 0), 1))
    }
}