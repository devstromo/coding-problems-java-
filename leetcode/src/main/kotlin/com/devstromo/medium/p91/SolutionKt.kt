package com.devstromo.medium.p91

class SolutionKt {
    fun numDecodings(s: String): Int {
        val dp = IntArray(s.length) { -1 }
        return dfs(0, s, dp)
    }

    private fun dfs(index: Int, s: String, dp: IntArray): Int {
        if (index == s.length) return 1
        if (s[index] == '0') return 0
        if (dp[index] != -1) return dp[index]

        var result = dfs(index + 1, s, dp)

        if (index + 1 < s.length) {
            val num = (s[index] - '0') * 10 + (s[index + 1] - '0')
            if (num in 10..26) {
                result += dfs(index + 2, s, dp)
            }
        }

        dp[index] = result
        return result
    }
}