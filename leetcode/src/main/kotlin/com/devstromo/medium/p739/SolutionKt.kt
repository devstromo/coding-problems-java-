package com.devstromo.medium.p739

import java.util.*

class SolutionKt {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = IntArray(temperatures.size)
        val stack = LinkedList<Int>()
        for (currentDay in temperatures.indices) {
            val currentTemperature = temperatures[currentDay]
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemperature) {
                val previousDay = stack.pop()
                answer[previousDay] = currentDay - previousDay
            }
            stack.push(currentDay)
        }
        return answer
    }
}