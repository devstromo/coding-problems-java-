package com.devstromo.hard.p1312

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Minimum Insertion Steps to Make a String Palindrome`() {
        assertEquals(0, solution.minInsertions("zzazz"))
        assertEquals(2, solution.minInsertions("mbadm"))
        assertEquals(5, solution.minInsertions("leetcode"))
    }
}