package com.devstromo.medium.p983

import java.util.HashSet
import kotlin.math.max
import kotlin.math.min

class SolutionKt {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val travelDays: MutableSet<Int> = HashSet()
        for (day in days) {
            travelDays.add(day)
        }

        val lastDay = days[days.size - 1]
        val dp = IntArray(lastDay + 1)

        for (i in 1..lastDay) {
            if (!travelDays.contains(i)) {
                dp[i] = dp[i - 1]
                continue
            }

            val cost1Day = dp[i - 1] + costs[0]
            val cost7Day = dp[max(0, (i - 7))] + costs[1]
            val cost30Day = dp[max(0, (i - 30))] + costs[2]

            dp[i] = min(cost1Day, min(cost7Day, cost30Day))
        }

        return dp[days[days.size - 1]]
    }
}