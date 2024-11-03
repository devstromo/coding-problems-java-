package com.devstromo.medium.p556

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Next Greater Element III`() {
        assertEquals(21, solution.nextGreaterElement(12))
        assertEquals(-1, solution.nextGreaterElement(21))
    }
}