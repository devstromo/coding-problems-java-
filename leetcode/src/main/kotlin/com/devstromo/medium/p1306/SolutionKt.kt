package com.devstromo.medium.p1306

import java.util.*

class SolutionKt {
    fun canReach(arr: IntArray, start: Int): Boolean {
        val queue = LinkedList<Int>()
        queue.add(start)
        val visited = HashSet<Int>()

        while (queue.isNotEmpty()) {
            val current = queue.poll()

            if (arr[current] == 0) {
                return true
            }
            if (visited.contains(current)) {
                continue
            }
            visited.add(current)

            val idxLeft = current - arr[current]
            val idxRight = current + arr[current]

            if (idxLeft >= 0 && !visited.contains(idxLeft)) {
                queue.add(idxLeft)
            }
            if (idxRight < arr.size && !visited.contains(idxRight)) {
                queue.add(idxRight)
            }
        }

        return false
    }

    fun canReachRecursive(arr: IntArray, start: Int): Boolean {
        val visited = BooleanArray(arr.size)
        return canReachRecursive(arr, start, visited)
    }

    private fun canReachRecursive(arr: IntArray, idx: Int, visited: BooleanArray): Boolean {
        if (idx < 0 || idx >= arr.size || visited[idx]) {
            return false
        }
        if (arr[idx] == 0) {
            return true
        }
        visited[idx] = true
        return canReachRecursive(arr, idx - arr[idx], visited) || canReachRecursive(arr, idx + arr[idx], visited)
    }
}