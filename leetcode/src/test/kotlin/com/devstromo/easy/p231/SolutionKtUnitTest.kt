package com.devstromo.easy.p231

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun testPowerOfTwo() {
        assertTrue(solutionKt.isPowerOfTwo(1), "1 is a power of two")
        assertTrue(solutionKt.isPowerOfTwo(2), "2 is a power of two")
        assertTrue(solutionKt.isPowerOfTwo(16), "16 is a power of two")
        assertTrue(solutionKt.isPowerOfTwo(1024), "1024 is a power of two")
    }

    @Test
    fun testNonPowerOfTwo() {
        assertFalse(solutionKt.isPowerOfTwo(3), "3 is not a power of two")
        assertFalse(solutionKt.isPowerOfTwo(18), "18 is not a power of two")
        assertFalse(solutionKt.isPowerOfTwo(31), "31 is not a power of two")
    }

    @Test
    fun testZeroAndNegative() {
        assertFalse(solutionKt.isPowerOfTwo(0), "0 is not a power of two")
        assertFalse(solutionKt.isPowerOfTwo(-1), "-1 is not a power of two")
        assertFalse(solutionKt.isPowerOfTwo(-16), "-16 is not a power of two")
    }

    @Test
    fun testEdgeCases() {
        assertFalse(solutionKt.isPowerOfTwo(Integer.MAX_VALUE), "Integer.MAX_VALUE is not a power of two")
        assertFalse(solutionKt.isPowerOfTwo(Integer.MIN_VALUE), "Integer.MIN_VALUE is not a power of two")
    }
}