package com.devstromo.medium.p238

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Product of Array Except Self`() {
        assertArrayEquals(intArrayOf(24, 12, 8, 6), solutionKt.productExceptSelf(intArrayOf(1, 2, 3, 4)))
        assertArrayEquals(intArrayOf(0, 0, 9, 0, 0), solutionKt.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3)))
    }
}