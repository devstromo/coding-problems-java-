package com.devstromo.easy.p20

import java.util.*

class SolutionKt {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            if (isOpenParentheses(c)) {
                stack.push(c)
            } else if (isClosedParentheses(c)) {
                if (stack.isEmpty() || !matchParentheses(stack.pop(), c)) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }

    private fun isOpenParentheses(open: Char): Boolean {
        return open == '(' || open == '{' || open == '['
    }

    private fun isClosedParentheses(closed: Char): Boolean {
        return closed == ')' || closed == '}' || closed == ']'
    }

    private fun matchParentheses(openParentheses: Char, closedParentheses: Char): Boolean {
        return when (openParentheses) {
            '(' -> closedParentheses == ')'
            '{' -> closedParentheses == '}'
            '[' -> closedParentheses == ']'
            else -> false
        }
    }
}