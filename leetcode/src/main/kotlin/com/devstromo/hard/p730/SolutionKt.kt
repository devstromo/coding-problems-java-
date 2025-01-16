package com.devstromo.hard.p730

import java.util.*

class SolutionKt {
    fun countPalindromicSubsequences(s: String): Int {
        val mod = 1000000007
        val chars = s.toCharArray()
        val n = chars.size
        val dp = IntArray(n)
        Arrays.fill(dp, 1)
        for (i in 0..<n) {
            var sum: Long = 0
            val map = IntArray(26)

            for (j in i - 1 downTo 0) {
                val prev = dp[j]
                if (chars[i] == chars[j]) {
                    dp[j] = ((sum + 2) % mod).toInt()
                }
                sum += (prev - map[chars[j].code - 'a'.code]).toLong()
                map[chars[j].code - 'a'.code] = prev
            }
        }

        val nums = IntArray(26)
        var sum: Long = 0
        for (i in 0..<n) {
            if (nums[chars[i].code - 'a'.code] == 0) {
                nums[chars[i].code - 'a'.code] = dp[i]
                sum += dp[i].toLong()
            }
        }
        return (sum % mod).toInt()
    }
}