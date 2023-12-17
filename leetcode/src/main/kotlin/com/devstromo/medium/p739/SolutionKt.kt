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

    fun dailyTemperaturesBest(temperatures: IntArray): IntArray {
        val returnValue = mutableListOf<Int>()
        val stack = Stack<Int>()
        for (index in temperatures.size - 1 downTo 0) {
            while(stack.isNotEmpty() && temperatures[index] >= temperatures[stack.peek()]) {
                stack.pop()
            }

            val day = if (stack.isNotEmpty()) stack.peek() - index else 0
            returnValue.add(day)

            stack.push(index)
        }

        return returnValue.reversed().toIntArray()
    }
}