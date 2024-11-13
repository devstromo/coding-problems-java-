package com.devstromo.medium.p525

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Max Length`() {
        assertEquals(2, solution.findMaxLength(intArrayOf(0, 1)))
        assertEquals(2, solution.findMaxLength(intArrayOf(0, 1, 0)))
    }
}