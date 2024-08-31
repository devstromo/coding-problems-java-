package com.devstromo.easy.p2042

class SolutionKt {
    fun areNumbersAscending(s: String): Boolean {
        var previous = -1
        var current = 0
        var isNumber = false

        for (element in s) {
            if (Character.isDigit(element)) {
                current = current * 10 + (element.code - '0'.code)
                isNumber = true
            } else if (isNumber) {
                if (current <= previous) {
                    return false
                }
                previous = current
                current = 0
                isNumber = false
            }
        }

        return !(isNumber && current <= previous)
    }
}