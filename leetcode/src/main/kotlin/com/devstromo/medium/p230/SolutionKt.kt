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


}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

}
