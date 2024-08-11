package com.devstromo.medium.p1817

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Jump Game VII`() {
        assertTrue(solution.canReach("011010", 2, 3))
        assertFalse(solution.canReach("01101110", 2, 3))
    }
}