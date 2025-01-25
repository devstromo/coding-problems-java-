package com.devstromo.medium.p712

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Minimum ASCII Delete Sum for Two Strings`() {
        assertEquals(231, solution.minimumDeleteSum("sea", "eat"))
        assertEquals(403, solution.minimumDeleteSum("delete", "leet"))
    }
}