package com.devstromo.medium.p1456;

import static java.lang.Math.max;

class Solution {
    public static int maxVowels(String s, int k) {
        var max = Integer.MIN_VALUE;
        var count = 0;
        for (var i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (i >= k) {
                if (isVowel(s.charAt(i - k))) {
                    count--;
                }
            }
            max = max(max, count);
        }
        return max;
    }

    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}
