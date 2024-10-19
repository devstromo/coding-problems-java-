package com.devstromo.easy.p628

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Maximum Product of Three Numbers`(){
        assertEquals(6, solutionKt.maximumProduct(intArrayOf(1, 2, 3)))
        assertEquals(24, solutionKt.maximumProduct(intArrayOf(1, 2, 3, 4)))
        assertEquals(-6, solutionKt.maximumProduct(intArrayOf(-1, -2, -3)))
        assertEquals(39200, solutionKt.maximumProduct(intArrayOf(-100, -98, -1, 2, 3, 4)))
    }
}