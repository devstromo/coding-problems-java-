package com.devstromo.easy.p495

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Poisoned Duration`() {
        assertEquals(4, solution.findPoisonedDuration(intArrayOf(1, 4), 2))
        assertEquals(3, solution.findPoisonedDuration(intArrayOf(1, 2), 2))
        assertEquals(0, solution.findPoisonedDuration(intArrayOf(0, 1, 4), 0))
        assertEquals(9, solution.findPoisonedDuration(intArrayOf(1, 2, 3, 4, 5), 5))
    }
}