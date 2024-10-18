package com.devstromo.medium.p152

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun test() {
        assertEquals(6, solution.maxProduct(intArrayOf(2, 3, -2, 4)))
        assertEquals(0, solution.maxProduct(intArrayOf(-2, 0, -1)))
        assertEquals(24, solution.maxProduct(intArrayOf(-2, 3, -4)))
    }
}