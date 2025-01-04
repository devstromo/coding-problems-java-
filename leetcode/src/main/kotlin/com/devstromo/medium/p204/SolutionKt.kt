package com.devstromo.medium.p204

import kotlin.math.sqrt

class SolutionKt {

    fun countPrimes(n: Int): Int {
        if (n < 2) return 0

        val isPrime = BooleanArray(n)

        var i = 2
        while (i * i < n) {
            if (!isPrime[i]) {
                var j = i * i
                while (j < n) {
                    isPrime[j] = true
                    j += i
                }
            }
            i++
        }

        var count = 0
        for (j in 2..<n) {
            if (!isPrime[j]) {
                count++
            }
        }

        return count
    }

    fun countPrimesBest(n: Int): Int {
        if(n < 3) return 0
        val dp = BooleanArray(n)
        dp[0] = true
        dp[1] = true
        for(i in 2..sqrt(n.toDouble()).toInt()) {
            if(!dp[i]) {
                var j = i + i
                while(j < dp.size) {
                    dp[j] = true
                    j += i
                }
            }
        }
        return dp.count { !it }
    }
}