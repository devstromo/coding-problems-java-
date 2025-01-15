package com.devstromo.hard.p124

import kotlin.math.max

class SolutionKt {
    private var maxSum = Int.MIN_VALUE
    fun maxPathSum(root: TreeNode?): Int {
        postOrder(root)
        return maxSum
    }

    private fun postOrder(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }

        val leftSum = max(0, postOrder(node.left))
        val rightSum = max(0, postOrder(node.right))

        maxSum = max(maxSum, (node.`val` + leftSum + rightSum))

        return (node.`val` + max(leftSum, rightSum))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}