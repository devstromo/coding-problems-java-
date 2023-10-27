package com.devstromo.easy.p144

class SolutionKt {
    fun preorderTraversal(root: TreeNodeKt?): List<Int> {
        val list = mutableListOf<Int>()
        preorder(root, list)
        return list
    }

    private fun preorder(root: TreeNodeKt?, list: MutableList<Int>) {
        if (root == null) {
            return
        }
        list.add(root.`val`)
        if (root.left != null)
            preorder(root.left, list)
        if (root.right != null)
            preorder(root.right, list)
    }
}