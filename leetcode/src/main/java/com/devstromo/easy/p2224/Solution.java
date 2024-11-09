package com.devstromo.easy.p2224;

public class Solution {
    private static final int[] increments = {60, 15, 5, 1};

    public int convertTime(String current, String correct) {
        int currentMinutes = timeToMinutes(current);
        int correctMinutes = timeToMinutes(correct);

        int difference = correctMinutes - currentMinutes;

        int operations = 0;

        for (int increment : increments) {
            if (difference == 0) break;
            operations += difference / increment;
            difference %= increment;
        }

        return operations;
    }

    private int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
