package com.devstromo.medium.p1035

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Uncrossed Lines`() {
        assertEquals(2, solution.maxUncrossedLines(intArrayOf(1, 4, 2), intArrayOf(1, 2, 4)))
        assertEquals(3, solution.maxUncrossedLines(intArrayOf(2, 5, 1, 2, 5), intArrayOf(10, 5, 2, 1, 5, 2)))
        assertEquals(2, solution.maxUncrossedLines(intArrayOf(1, 3, 7, 1, 7, 5), intArrayOf(1, 9, 2, 5, 1)))
    }
}