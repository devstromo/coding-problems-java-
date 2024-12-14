package com.devstromo.easy.p1991

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Middle Index`() {
        assertEquals(3, solution.findMiddleIndex(intArrayOf(2, 3, -1, 8, 4)))
        assertEquals(2, solution.findMiddleIndex(intArrayOf(1, -1, 4)))
        assertEquals(-1, solution.findMiddleIndex(intArrayOf(2, 5)))
    }
}