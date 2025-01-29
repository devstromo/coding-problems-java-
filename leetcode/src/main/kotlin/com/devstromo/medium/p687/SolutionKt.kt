package com.devstromo.medium.p687

import kotlin.math.max

class SolutionKt {
    private var maxPath = 0
    fun longestUnivaluePath(root: TreeNode?): Int {
        if (root == null) return 0
        dfs(root)
        return maxPath
    }

    private fun dfs(node: TreeNode?): Int {
        if (node == null) return 0

        val left = dfs(node.left)
        val right = dfs(node.right)

        var leftPath = 0
        var rightPath = 0

        if (node.left != null && node.left!!.`val` == node.`val`) {
            leftPath = left + 1
        }
        if (node.right != null && node.right!!.`val` == node.`val`) {
            rightPath = right + 1
        }

        maxPath = max(maxPath, (leftPath + rightPath))
        return max(leftPath, rightPath)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}