package com.devstromo.easy.p1816;

class Solution {
    public static String truncateSentence(String s, int k) {
        var count = 0;
        for (var i = 0; i < s.length() && count < k; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k) {
                return s.substring(0, i);
            }
        }
        return s;
    }
}
