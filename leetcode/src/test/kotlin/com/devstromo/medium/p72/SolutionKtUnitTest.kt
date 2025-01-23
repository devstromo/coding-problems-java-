package com.devstromo.medium.p72

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Edit Distance`() {
        assertEquals(3, solutionKt.minDistance("saturday", "sunday"))
        assertEquals(3, solutionKt.minDistance("horse", "ros"))
        assertEquals(5, solutionKt.minDistance("intention", "execution"))
        assertEquals(1, solutionKt.minDistance("", "a"))
    }

}