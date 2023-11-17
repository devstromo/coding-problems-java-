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

    fun isHappyMath(n: Int): Boolean {
        var slow = n
        var fast = slow
        do {
            slow = sumOfSquares(slow)
            fast = sumOfSquares(fast)
            fast = sumOfSquares(fast)
        } while (slow != fast)
        return slow == 1
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