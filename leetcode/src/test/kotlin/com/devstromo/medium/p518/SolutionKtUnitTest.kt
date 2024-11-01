package com.devstromo.medium.p518

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Change Coin II`() {
        assertEquals(4, solution.change(5, intArrayOf(1, 2, 5)))
        assertEquals(0, solution.change(3, intArrayOf(2)))
        assertEquals(1, solution.change(10, intArrayOf(10)))
    }
}