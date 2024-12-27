package com.devstromo.easy.p495

class SolutionKt {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        val n = timeSeries.size
        var totalPoisonedTime = 0
        var start = timeSeries[0]
        var end = start + duration
        for (i in 1..<n) {
            val time = timeSeries[i]
            if (time > end) {
                totalPoisonedTime += end - start
                start = time
            }
            end = time + duration
        }
        totalPoisonedTime += end - start

        return totalPoisonedTime
    }
}