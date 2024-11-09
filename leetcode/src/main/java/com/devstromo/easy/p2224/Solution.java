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

    public int convertTimeBest(String current, String correct) {
        int currentTime = ((((current.charAt(0) - '0') * 10) + (current.charAt(1) - '0')) * 60) + ((current.charAt(3) - '0') * 10) + (current.charAt(4) - '0');
        int correctTime = ((((correct.charAt(0) - '0') * 10) + (correct.charAt(1) - '0')) * 60) + ((correct.charAt(3) - '0') * 10) + (correct.charAt(4) - '0');
        int move = 0;
        int difference = correctTime - currentTime;
        for (int increment : increments) {
            move += (difference / increment);
            difference %= increment;
        }
        return move;
    }

    private int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
