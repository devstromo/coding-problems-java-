package com.devstromo.medium.p204

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
}