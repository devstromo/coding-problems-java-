package com.devstromo.medium.p103

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Binary Tree Zigzag Level Order Traversal`() {
        val root = SolutionKt.TreeNode(3).apply {
            left = SolutionKt.TreeNode(9)
            right = SolutionKt.TreeNode(20).apply {
                left = SolutionKt.TreeNode(15)
                right = SolutionKt.TreeNode(7)
            }
        }
        assertEquals(listOf(listOf(3), listOf(20, 9), listOf(15, 7)), solution.zigzagLevelOrder(root))
        val singleRoot = SolutionKt.TreeNode(1)
        assertEquals(listOf(listOf(1)), solution.zigzagLevelOrder(singleRoot))
        assertEquals(listOf<SolutionKt.TreeNode>(), solution.zigzagLevelOrder(null))

    }

    @Test
    fun `Binary Tree Zigzag Level Order Traversal Best`() {
        val root = SolutionKt.TreeNode(3).apply {
            left = SolutionKt.TreeNode(9)
            right = SolutionKt.TreeNode(20).apply {
                left = SolutionKt.TreeNode(15)
                right = SolutionKt.TreeNode(7)
            }
        }
        assertEquals(listOf(listOf(3), listOf(20, 9), listOf(15, 7)), solution.zigzagLevelOrderBest(root))
        val singleRoot = SolutionKt.TreeNode(1)
        assertEquals(listOf(listOf(1)), solution.zigzagLevelOrderBest(singleRoot))
        assertEquals(listOf<SolutionKt.TreeNode>(), solution.zigzagLevelOrderBest(null))

    }
}