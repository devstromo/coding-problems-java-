package com.devstromo.medium.p307

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumArrayKtUnitTest {
    @Test
    fun `Test Num Array Mutable`() {
        val numArray = NumArrayKt(intArrayOf(1, 3, 5))
        assertEquals(9, numArray.sumRange(0, 2))
        numArray.update(1, 2)
        assertEquals(8, numArray.sumRange(0, 2))
    }

    @Test
    fun `Test Num Array Mutable 2`() {
        val numArray = NumArrayKt(intArrayOf(-1))
        assertEquals(-1, numArray.sumRange(0, 0))
        numArray.update(0, 1)
        assertEquals(1, numArray.sumRange(0, 0))
    }
}