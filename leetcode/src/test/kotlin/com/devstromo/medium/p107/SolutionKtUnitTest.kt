package com.devstromo.medium.p107

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Binary Tree Level Order Traversal II`() {
        val root = SolutionKt.TreeNode(3).apply {
            left = SolutionKt.TreeNode(9)
            right = SolutionKt.TreeNode(20).apply {
                left = SolutionKt.TreeNode(15)
                right = SolutionKt.TreeNode(7)
            }
        }
        assertEquals(listOf(listOf(15, 7), listOf(9, 20), listOf(3)), solution.levelOrderBottom(root))
        val singleRoot = SolutionKt.TreeNode(1)
        assertEquals(listOf(listOf(1)), solution.levelOrderBottom(singleRoot))
        assertEquals(listOf<SolutionKt.TreeNode>(), solution.levelOrderBottom(null))

    }
}