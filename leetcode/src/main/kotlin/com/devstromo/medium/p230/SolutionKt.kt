package com.devstromo.medium.p230

import java.util.*


class SolutionKt {

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val stack = Stack<TreeNode>()
        var current = root
        var kRemaining = k

        while (stack.isNotEmpty() || current != null) {
            while (current != null) {
                stack.push(current)
                current = current.left
            }

            current = stack.pop()
            kRemaining--
            if (kRemaining == 0) return current.`val`

            current = current.right
        }

        return -1
    }

    var index = 0
    var element: Int? = null
    fun kthSmallestBest(root: TreeNode?, k: Int): Int {
        findElement(root, k)
        return element ?: 0
    }

    private fun findElement(root: TreeNode?, k: Int) {
        if (root == null) return
        if (element != null) return

        findElement(root.left, k)

        if (++index == k) {
            element = root.`val`
            return
        }

        findElement(root.right, k)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

}
