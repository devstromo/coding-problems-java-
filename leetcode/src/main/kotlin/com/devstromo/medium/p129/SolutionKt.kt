package com.devstromo.medium.p129

internal class SolutionKt {
    private var totalSum = 0
    fun sumNumbers(root: TreeNode?): Int {
        preOrder(root, 0)
        return totalSum
    }

    private fun preOrder(root: TreeNode?, sum: Int) {
        if (root == null) return
        val sumValue = sum * 10 + root.`val`
        if (root.left == null && root.right == null) {
            totalSum += sumValue
        }
        preOrder(root.left, sumValue)
        preOrder(root.right, sumValue)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}