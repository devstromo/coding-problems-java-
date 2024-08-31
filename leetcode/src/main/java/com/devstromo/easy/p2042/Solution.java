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

    private boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
}
