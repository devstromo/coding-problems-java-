package com.devstromo.medium.p5;

public class Solution {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        var n = s.length();
        var start = 0;
        var end = 0;
        for (var i = 0; i < n; i++) {
            var len1 = expandAroundCenter(s, i, i);
            var len2 = expandAroundCenter(s, i, i + 1);
            var len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
