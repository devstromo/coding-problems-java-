package com.devstromo.easy.p2042;

import java.util.StringTokenizer;

public class Solution {
    public boolean areNumbersAscending(String s) {
        final var stringTokenizer = new StringTokenizer(s);
        int prev = -1;

        while (stringTokenizer.hasMoreTokens()) {
            final var token = stringTokenizer.nextToken();
            if (isNumber(token)) {
                int current = Integer.parseInt(token);
                if (current <= prev) {
                    return false;
                }
                prev = current;
            }
        }
        return true;
    }


    public boolean areNumbersAscendingBest(String s) {
        int prevNumber = -1;
        int currNumber = 0;
        boolean isNumber = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currNumber = currNumber * 10 + (c - '0');
                isNumber = true;
            } else if (isNumber) {
                if (currNumber <= prevNumber) {
                    return false;
                }
                prevNumber = currNumber;
                currNumber = 0;
                isNumber = false;
            }
        }

        if (isNumber && currNumber <= prevNumber) {
            return false;
        }

        return true;
    }

    private boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
}
