package com.devstromo.easy.p27


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun testRemoveElementKt() {
        assertEquals(5, solutionKt.removeElementKt(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
    }

    @Test
    fun testRemoveElementKt2() {
        assertEquals(2, solutionKt.removeElementKt(intArrayOf(3, 2, 2, 3), 3))
    }

    @Test
    fun testRemoveElementKt3() {
        assertEquals(0, solutionKt.removeElementKt(intArrayOf(2, 2, 2), 2))
    }

    @Test
    fun testRemoveElementKt4() {
        assertEquals(0, solutionKt.removeElementKt(intArrayOf(2), 2))
    }

    @Test
    fun testRemoveElementBestKt() {
        assertEquals(5, solutionKt.removeElementBestKt(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
    }

    @Test
    fun testRemoveElementBestKt2() {
        assertEquals(2, solutionKt.removeElementBestKt(intArrayOf(3, 2, 2, 3), 3))
    }

    @Test
    fun testRemoveElementBestKt3() {
        assertEquals(0, solutionKt.removeElementBestKt(intArrayOf(2, 2, 2), 2))
    }

    @Test
    fun testRemoveElementBestKt4() {
        assertEquals(0, solutionKt.removeElementBestKt(intArrayOf(2), 2))
    }
}