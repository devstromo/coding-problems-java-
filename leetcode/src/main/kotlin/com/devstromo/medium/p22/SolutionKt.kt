package com.devstromo.medium.p22

import java.util.*
import kotlin.collections.ArrayList

class SolutionKt {
    fun generateParenthesis(n: Int): List<String> {
        val dp: MutableList<List<String>> = ArrayList()
        dp.add(listOf(""))

        for (i in 1..n) {
            val currentList: MutableList<String> = ArrayList()
            for (j in 0 until i) {
                for (left in dp[j]) {
                    for (right in dp[i - 1 - j]) {
                        currentList.add("($left)$right")
                    }
                }
            }
            dp.add(currentList)
        }

        return dp[n]
    }

    fun generateParenthesisBest(n: Int): List<String> {
        val result = LinkedList<String>()
        addParen(result, n, n, CharArray(n * 2), 0)
        return result
    }

    private fun addParen(list: MutableList<String>, leftRem: Int, rightRem: Int, chars: CharArray, count: Int) {
        if (rightRem < leftRem || leftRem < 0) return

        if (leftRem == 0 && rightRem == 0) {
            list.add(String(chars))
            return
        }

        if (leftRem > 0) {
            chars[count] = '('
            addParen(list, leftRem - 1, rightRem, chars, count + 1)
        }

        if (rightRem > leftRem) {
            chars[count] = ')'
            addParen(list, leftRem, rightRem - 1, chars, count + 1)
        }
    }
}