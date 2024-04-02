package com.devstromo.medium.p1638;

public class Solution {
    public int countSubstrings(String s, String t) {
        int i;
        int result = 0;
        for (i = 0; i < s.length(); i++) {
            result += traverse(i, 0, s, t);
        }
        for (i = 1; i < t.length(); i++) {
            result += traverse(0, i, s, t);
        }
        return result;
    }

    private int traverse(int i, int j, String s, String t) {
        int prev = 0;
        int prev2 = 0;
        int result = 0;
        int current;
        int current2;
        boolean match;
        while (i < s.length() && j < t.length()) {
            match = s.charAt(i++) == t.charAt(j++);
            current = match ? prev + 1 : 0;
            current2 = match ? prev2 : prev + 1;
            result += current2;

            prev = current;
            prev2 = current2;
        }
        return result;
    }
}
