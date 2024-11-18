package com.devstromo.medium.p3129

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Number Of Stable Arrays`() {
        assertEquals(2, solution.numberOfStableArrays(1, 1, 2))
        assertEquals(1, solution.numberOfStableArrays(1, 2, 1))
        assertEquals(14, solution.numberOfStableArrays(3, 3, 2))
    }

}