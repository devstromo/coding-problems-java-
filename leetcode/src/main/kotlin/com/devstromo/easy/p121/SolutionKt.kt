package com.devstromo.easy.p121

class SolutionKt {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var minPrice = Int.MAX_VALUE
        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else if (price - minPrice > profit) {
                profit = price - minPrice
            }
        }
        return profit
    }

}