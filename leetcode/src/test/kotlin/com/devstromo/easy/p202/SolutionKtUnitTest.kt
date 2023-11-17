package com.devstromo.easy.p202


import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {

    private val solutionKt = SolutionKt()

    @Test
    fun testIsHappy() {
        assertTrue(solutionKt.isHappy(19))
    }

    @Test
    fun testNotIsHappy() {
        assertFalse(solutionKt.isHappy(2))
    }

    @Test
    fun testIsHappyMath() {
        assertTrue(solutionKt.isHappyMath(19))
    }

    @Test
    fun testNotIsHappyMath() {
        assertFalse(solutionKt.isHappyMath(2))
    }
}