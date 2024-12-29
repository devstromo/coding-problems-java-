package com.devstromo.medium.p2207

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Maximum Subsequence Count`() {
        assertEquals(4, solution.maximumSubsequenceCount("abdcdbc", "ac"))
        assertEquals(6, solution.maximumSubsequenceCount("aabb", "ab"))
    }
}