package com.devstromo.medium.p22

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
}