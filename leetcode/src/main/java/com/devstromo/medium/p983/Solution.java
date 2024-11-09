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

    public int mincostTicketsBest(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int[] freq = new int[lastDay + 1];

        // Mark the travel days in the freq array
        for (int day : days) {
            freq[day] = 1;
        }

        // Initialize dp array with -1 for memoization
        Integer[] dp = new Integer[lastDay + 1];

        return solve(freq, costs, 0, dp);
    }

    static int solve(int[] days, int[] costs, int day, Integer[] dp) {
        if (day >= days.length) {
            return 0; // No cost if we're beyond the last day
        }
        if (dp[day] != null) {
            return dp[day];
        }
        if (days[day] == 0) { // No travel on this day, move to next day
            return dp[day] = solve(days, costs, day + 1, dp);
        }

        // Three options for buying tickets
        int oneDayCost = costs[0] + solve(days, costs, day + 1, dp);
        int sevenDayCost = costs[1] + solve(days, costs, day + 7, dp);
        int thirtyDayCost = costs[2] + solve(days, costs, day + 30, dp);

        // Store and return the minimum cost
        return dp[day] = Math.min(oneDayCost, Math.min(sevenDayCost, thirtyDayCost));
    }
}
