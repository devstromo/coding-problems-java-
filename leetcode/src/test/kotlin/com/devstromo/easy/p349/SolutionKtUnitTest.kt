package com.devstromo.easy.p349


import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun testIntersectionKt() {
        assertArrayEquals(intArrayOf(2), solutionKt.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)))
    }

    @Test
    fun testIntersectionKt2() {
        assertArrayEquals(intArrayOf(4, 9), solutionKt.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)))
    }

    @Test
    fun testIntersectionBestKt() {
        assertArrayEquals(intArrayOf(2), solutionKt.intersectionBest(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)))
    }

    @Test
    fun testIntersectionBestKt2() {
        assertArrayEquals(intArrayOf(4, 9), solutionKt.intersectionBest(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)))
    }
}