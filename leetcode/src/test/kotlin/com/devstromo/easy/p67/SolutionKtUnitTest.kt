package com.devstromo.easy.p67

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {

    private val solutionKt = SolutionKt()

    @Test
    fun testAddBinaryKt() {
        assertEquals("100", solutionKt.addBinary("11", "1"))
    }

    @Test
    fun testAddBinaryKt2() {
        assertEquals("10101", solutionKt.addBinary("1010", "1011"))
    }

    @Test
    fun testAddBinaryIterateKt() {
        assertEquals("100", solutionKt.addBinaryIterate("11", "1"))
    }

    @Test
    fun testAddBinaryIterateKt2() {
        assertEquals("10101", solutionKt.addBinaryIterate("1010", "1011"))
    }
}