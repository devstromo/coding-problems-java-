package com.devstromo.easy.p144

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun testExample1() {
        val root = TreeNode(1).apply {
            right = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }

        val expected = listOf(1, 2, 3)
        assertEquals(expected, solution.preorderTraversal(root))
    }

    @Test
    fun testExample2() {
        val root: TreeNode? = null

        val expected = listOf<Int>()
        assertEquals(expected, solution.preorderTraversal(root))
    }

    @Test
    fun testExample3() {
        val root = TreeNode(1)

        val expected = listOf(1)
        assertEquals(expected, solution.preorderTraversal(root))
    }
}