package com.devstromo.medium.p241

class SolutionKt {
    private val memo: MutableMap<String, List<Int>> = HashMap()
    fun diffWaysToCompute(expression: String): List<Int> {
        if (memo.containsKey(expression)) {
            return memo[expression]!!
        }

        val result: MutableList<Int> = ArrayList()
        var isNumber = true


        // Iterate over the expression
        for (i in expression.indices) {
            val c = expression[i]
            if (c == '+' || c == '-' || c == '*') {
                isNumber = false

                // Split at operator into left and right sub-expressions
                val leftResults = diffWaysToCompute(expression.substring(0, i))
                val rightResults = diffWaysToCompute(expression.substring(i + 1))

                // Compute all possible results
                for (left in leftResults) {
                    for (right in rightResults) {
                        result.add(compute(left, right, c))
                    }
                }
            }
        }


        // If no operator was found, treat the string as a number
        if (isNumber) {
            result.add(expression.toInt())
        }

        memo[expression] = result
        return result
    }

    private fun compute(left: Int, right: Int, operator: Char): Int {
        return when (operator) {
            '+' -> left + right
            '-' -> left - right
            '*' -> left * right
            else -> throw IllegalArgumentException("Invalid operator")
        }
    }
}