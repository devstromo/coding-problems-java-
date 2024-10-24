package com.devstromo.medium.p287

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Find Duplicate`() {
        assertEquals(2, solutionKt.findDuplicate(intArrayOf(1, 3, 4, 2, 2)))
        assertEquals(3, solutionKt.findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
        assertEquals(3, solutionKt.findDuplicate(intArrayOf(3, 3, 3, 3, 3)))
    }
}