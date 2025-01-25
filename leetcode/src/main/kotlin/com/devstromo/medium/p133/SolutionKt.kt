package com.devstromo.medium.p133

class SolutionKt {
    private val map = HashMap<Int, Node>()

    fun cloneGraph(node: Node?): Node? {
        if (node == null) {
            return null
        }

        if (map.containsKey(node.`val`)) {
            return map[node.`val`]
        }

        val newNode = Node(node.`val`)
        map[newNode.`val`] = newNode
        for (neighbor in node.neighbors) {
            newNode.neighbors.add(cloneGraph(neighbor))
        }
        return newNode
    }

    class Node(var `val`: Int) {
        var neighbors: ArrayList<Node?> = ArrayList<Node?>()
    }

}