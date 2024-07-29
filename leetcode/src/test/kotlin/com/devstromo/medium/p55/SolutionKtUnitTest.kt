package com.devstromo.medium.p55

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Can Jump`() {
        assertTrue(solution.canJump(intArrayOf(2, 3, 1, 1, 4)))
        assertFalse(solution.canJump(intArrayOf(3, 2, 1, 0, 4)))
    }

}