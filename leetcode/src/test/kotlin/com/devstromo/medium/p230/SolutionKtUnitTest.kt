package com.devstromo.medium.p230

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find kth Smallest`() {
        val root = TreeNode(3)
        root.left = TreeNode(1)
        root.left!!.right = TreeNode(2)
        root.right = TreeNode(4)
        assertEquals(1, solution.kthSmallest(root, 1))
    }
}