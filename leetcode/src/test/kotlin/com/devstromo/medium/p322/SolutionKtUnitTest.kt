package com.devstromo.medium.p322

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun testCoinChangeKt() {
        assertEquals(3, solutionKt.coinChange(intArrayOf(1, 2, 5), 11))
    }

    @Test
    fun testCoinChangeKt2() {
        assertEquals(-1, solutionKt.coinChange(intArrayOf(2), 1))
    }

    @Test
    fun testCoinChangeKt3() {
        assertEquals(0, solutionKt.coinChange(intArrayOf(1), 0))
    }

    @Test
    fun testCoinChangeKtBest() {
        assertEquals(3, solutionKt.coinChangeBest(intArrayOf(1, 2, 5), 11))
    }

    @Test
    fun testCoinChangeKtBest2() {
        assertEquals(-1, solutionKt.coinChangeBest(intArrayOf(2), 1))
    }

    @Test
    fun testCoinChangeKtBest3() {
        assertEquals(0, solutionKt.coinChangeBest(intArrayOf(1), 0))
    }
}