package com.devstromo.easy.p144

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun testExample1() {
        val root = TreeNodeKt(1).apply {
            right = TreeNodeKt(2).apply {
                left = TreeNodeKt(3)
            }
        }

        val expected = listOf(1, 2, 3)
        assertEquals(expected, solution.preorderTraversal(root))
    }

    @Test
    fun testExample2() {
        val root: TreeNodeKt? = null

        val expected = listOf<Int>()
        assertEquals(expected, solution.preorderTraversal(root))
    }

    @Test
    fun testExample3() {
        val root = TreeNodeKt(1)

        val expected = listOf(1)
        assertEquals(expected, solution.preorderTraversal(root))
    }
}