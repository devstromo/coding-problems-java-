package com.devstromo.easy.p112

class SolutionKt {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        if (root.left == null && root.right == null) return targetSum == root.`val`

        return hasPathSum(root.left, targetSum - root.`val`)
                || hasPathSum(root.right, targetSum - root.`val`)

    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}