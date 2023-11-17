package com.devstromo.easy.p202

class SolutionKt {
    fun isHappy(n: Int): Boolean {
        var number = n
        val seen = HashSet<Int>()
        while (number != 1) {
            if (!seen.add(number)) {
                return false
            }
            number = sumOfSquares(number)
        }
        return true
    }

    private fun sumOfSquares(num: Int): Int {
        var number = num
        var sum = 0
        while (number > 0) {
            val digit = number % 10
            sum += digit * digit
            number /= 10
        }
        return sum
    }
}