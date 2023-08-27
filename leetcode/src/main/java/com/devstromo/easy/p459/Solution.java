package com.devstromo.easy.p459;

class Solution {
    public static boolean repeatedSubstringPattern(String s) {
        var i = 1;
        var j = 0;
        var n = s.length();
        var dp = new int[n + 1];
        while (i < n) {
            if (s.charAt(i) == s.charAt(j)) {
                dp[++i] = ++j;
            } else if (j == 0) {
                i++;
            } else {
                j = dp[j];
            }
        }
        return dp[n] != 0 && dp[n] % (n - dp[n]) == 0;
    }

    public static boolean repeatedSubstringPatternBest(String s) {
        var n = s + s;
        return n.substring(1, n.length() - 1)
          .contains(s);
    }
}
