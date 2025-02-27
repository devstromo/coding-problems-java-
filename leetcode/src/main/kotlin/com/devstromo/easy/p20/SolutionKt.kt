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

    fun isValidBest(s: String): Boolean {
        if (s.length % 2 == 1) return false

        val stack = IntArray(s.length)
        var top = -1

        for (char in s) {
            when (char) {
                '(' -> stack[++top] = 0
                '[' -> stack[++top] = 1
                '{' -> stack[++top] = 2
                ')' -> if (top < 0 || stack[top--] != 0) return false
                ']' -> if (top < 0 || stack[top--] != 1) return false
                '}' -> if (top < 0 || stack[top--] != 2) return false
            }
        }
        return top == -1
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