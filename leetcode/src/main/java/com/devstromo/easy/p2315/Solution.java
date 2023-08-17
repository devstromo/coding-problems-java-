package com.devstromo.easy.p2315;

class Solution {
    public static int countAsterisks(String s) {
        var words = s.split("\\|");
        var step = 0;
        var count = 0;
        for (var word : words) {
            if (step % 2 == 0) {
                for (var i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == '*') {
                        count++;
                    }
                }
            }
            step++;
        }
        return count;
    }

    public static int countAsterisksNonSplit(String s) {
        var step = 0;
        var count = 0;
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                step++;
            } else if (step == 0 && s.charAt(i) == '*') {
                count++;
            }
            if (step == 2) {
                step = 0;
            }
        }
        return count;
    }
}
