package com.devstromo.medium.p210

import java.util.*

class SolutionKt {
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        val graph: MutableList<MutableList<Int>> = ArrayList()
        val inDegree = IntArray(numCourses)

        for (i in 0..<numCourses) {
            graph.add(ArrayList())
        }

        for (prereq in prerequisites) {
            graph[prereq[1]].add(prereq[0])
            inDegree[prereq[0]]++
        }

        val queue: Queue<Int> = LinkedList()
        for (i in 0..<numCourses) {
            if (inDegree[i] == 0) {
                queue.offer(i)
            }
        }

        val order = IntArray(numCourses)
        var index = 0

        while (!queue.isEmpty()) {
            val current = queue.poll()
            order[index++] = current

            for (neighbor in graph[current]) {
                inDegree[neighbor]--
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor)
                }
            }
        }

        return if (index == numCourses) order else IntArray(0)
    }

    fun findOrderBest(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        val adj = Array<ArrayList<Int>?>(numCourses) { ArrayList() }

        for ((a, b) in prerequisites) {
            adj[a]!!.add(b)
        }

        val visited = BooleanArray(numCourses)

        val result = IntArray(numCourses)
        var resultIndex = 0

        fun dfs(n: Int): Boolean {
            if (visited[n]) return false
            if (adj[n] == null) {
                return true
            }

            visited[n] = true
            for (p in adj[n]!!) {
                if (!dfs(p)) return false
            }
            visited[n] = false
            adj[n] = null
            result[resultIndex++] = n
            return true
        }

        for (i in 0..<numCourses) {
            if (!dfs(i)) return intArrayOf()
        }

        return result
    }
}