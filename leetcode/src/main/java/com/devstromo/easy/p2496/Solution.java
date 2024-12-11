package com.devstromo.easy.p2496;

public class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for (String s : strs) {
            boolean isNumber = true;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    max = Math.max(max, s.length());
                    isNumber = false;
                    break;
                }
            }
            if (isNumber) {
                max = Math.max(max, Integer.parseInt(s));
            }
        }
        return max;
    }

    public int maximumValueSimple(String[] strs) {
        int max = Integer.MIN_VALUE;

        for (String s : strs) {
            try {
                max = Math.max(max, Integer.parseInt(s));
            } catch (NumberFormatException e) {
                max = Math.max(max, s.length());
            }
        }

        return max;
    }
}
