package com.devstromo.easy.p1952

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test isThree`() {
        assertTrue(solution.isThree(4))
    }

    @Test
    fun `Test is not three`() {
        assertFalse(solution.isThree(2))
    }
    @Test
    fun `Test isThree Best`() {
        assertTrue(solution.isThreeBest(4))
    }

    @Test
    fun `Test is not three (Best)`() {
        assertFalse(solution.isThreeBest(2))
    }
}