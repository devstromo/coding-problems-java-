package com.devstromo.easy.p257

class SolutionKt {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val ans = mutableListOf<String>()
        dfs(root, java.lang.StringBuilder(), ans)
        return ans
    }

    private fun dfs(root: TreeNode?, sb: StringBuilder, ans: MutableList<String>) {
        if (root == null) return
        if (root.left == null && root.right == null) {
            ans.add(sb.append(root.`val`).toString())
            return
        }

        val length = sb.length
        dfs(root.left, sb.append(root.`val`).append("->"), ans)
        sb.setLength(length)
        dfs(root.right, sb.append(root.`val`).append("->"), ans)
        sb.setLength(length)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}