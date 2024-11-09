package com.devstromo.medium.p983;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Set<Integer> travelDays = new HashSet<>();
        for (int day : days) {
            travelDays.add(day);
        }

        int[] dp = new int[366];

        for (int i = 1; i <= 365; i++) {
            if (!travelDays.contains(i)) {
                dp[i] = dp[i - 1];
                continue;
            }

            int cost1Day = dp[i - 1] + costs[0];
            int cost7Day = dp[Math.max(0, i - 7)] + costs[1];
            int cost30Day = dp[Math.max(0, i - 30)] + costs[2];

            dp[i] = Math.min(cost1Day, Math.min(cost7Day, cost30Day));
        }

        return dp[days[days.length - 1]];
    }
}
