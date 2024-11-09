package com.devstromo.easy.p2224

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Convert Time`() {
        assertEquals(3, solution.convertTime("02:30", "04:35"))
        assertEquals(1, solution.convertTime("11:00", "11:01"))
    }
}