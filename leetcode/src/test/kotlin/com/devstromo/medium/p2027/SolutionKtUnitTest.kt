package com.devstromo.medium.p2027

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Extra Characters in a String`() {
        assertEquals(1, solution.minExtraChar("leetscode", arrayOf("leet", "code", "leetcode")))
        assertEquals(3, solution.minExtraChar("sayhelloworld", arrayOf("hello", "world")))
    }
}