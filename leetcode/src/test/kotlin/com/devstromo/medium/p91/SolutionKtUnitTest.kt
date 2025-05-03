package com.devstromo.medium.p91

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {

    private val solution = SolutionKt()

    @Test
    fun `Test Decode Ways`() {
        assertEquals(2, solution.numDecodings("12"))
        assertEquals(3, solution.numDecodings("226"))
        assertEquals(0, solution.numDecodings("06"))
    }
}