package com.devstromo.medium.p978

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Max Turbulence Subarray`() {
        assertEquals(5, solution.maxTurbulenceSize(intArrayOf(9, 4, 2, 10, 7, 8, 8, 1, 9)))
        assertEquals(2, solution.maxTurbulenceSize(intArrayOf(4, 8, 12, 16)))
        assertEquals(1, solution.maxTurbulenceSize(intArrayOf(100)))
    }
}