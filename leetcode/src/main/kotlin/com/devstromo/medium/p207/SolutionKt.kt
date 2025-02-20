package com.devstromo.medium.p207

class SolutionKt {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val graph: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until numCourses) {
            graph.add(ArrayList())
        }

        for (pre in prerequisites) {
            graph[pre[1]].add(pre[0]) // Directed edge: pre[1] → pre[0]
        }

        val visited = IntArray(numCourses) // 0 = unvisited, 1 = visiting, 2 = visited

        for (i in 0..<numCourses) {
            if (hasCycle(i, graph, visited)) {
                return false
            }
        }
        return true
    }

    private fun hasCycle(node: Int, graph: List<List<Int>>, visited: IntArray): Boolean {
        if (visited[node] == 1) return true // Found a cycle
        if (visited[node] == 2) return false // Already checked
        visited[node] = 1 // Mark as visiting
        for (neighbor in graph[node]) {
            if (hasCycle(neighbor, graph, visited)) {
                return true
            }
        }
        visited[node] = 2 // Mark as visited
        return false
    }
}