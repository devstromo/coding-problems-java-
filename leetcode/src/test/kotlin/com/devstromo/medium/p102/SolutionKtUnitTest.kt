package com.devstromo.medium.p102

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Binary Tree Level Order Traversal`() {
        val root = SolutionKt.TreeNode(3).apply {
            left = SolutionKt.TreeNode(9).apply {}
            right = SolutionKt.TreeNode(20).apply {
                left = SolutionKt.TreeNode(15)
                right = SolutionKt.TreeNode(7)
            }
        }
        assertEquals(listOf(listOf(3), listOf(9, 20), listOf(15, 7)), solution.levelOrder(root))
    }

    @Test
    fun `Test Binary Tree Level Order Traversal Best`() {
        val root = SolutionKt.TreeNode(3).apply {
            left = SolutionKt.TreeNode(9).apply {}
            right = SolutionKt.TreeNode(20).apply {
                left = SolutionKt.TreeNode(15)
                right = SolutionKt.TreeNode(7)
            }
        }
        assertEquals(listOf(listOf(3), listOf(9, 20), listOf(15, 7)), solution.levelOrderBest(root))
    }
}