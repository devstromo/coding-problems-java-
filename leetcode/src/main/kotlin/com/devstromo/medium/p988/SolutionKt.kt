package com.devstromo.medium.p988

class SolutionKt {
    private var smallest = "~"
    fun smallestFromLeaf(root: TreeNodeKt?): String {
        dfs(root, java.lang.StringBuilder())
        return smallest
    }

    private fun dfs(node: TreeNodeKt?, path: StringBuilder) {
        if (node == null) return

        // Prepend the current character (since we want string from leaf to root)
        path.insert(0, (node.`val` + 'a'.code).toChar())

        if (node.left == null && node.right == null) {
            val current = path.toString()
            if (current < smallest) {
                smallest = current
            }
        }

        dfs(node.left, path)
        dfs(node.right, path)

        // Backtrack: remove the character we added at the beginning
        path.deleteCharAt(0)
    }

    class TreeNodeKt(var `val`: Int) {
        var left: TreeNodeKt? = null
        var right: TreeNodeKt? = null
    }
}