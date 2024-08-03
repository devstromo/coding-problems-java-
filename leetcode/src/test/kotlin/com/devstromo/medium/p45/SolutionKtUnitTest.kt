package com.devstromo.medium.p45

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Jump Game II`() {
        assertEquals(2, solution.jump(intArrayOf(2, 3, 1, 1, 4)))
        assertEquals(2, solution.jump(intArrayOf(2, 3, 0, 1, 4)))
    }

}