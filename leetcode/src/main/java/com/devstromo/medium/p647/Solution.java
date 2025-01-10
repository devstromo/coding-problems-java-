package com.devstromo.medium.p647;

public class Solution {
    int res = 0;

    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            count++;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                count++;
            }
        }

        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }

        return count;
    }

    public int countSubstringsBest(String s) {
        res = 0; // to run multiples test cases
        int n = s.length();
        for (int i = 0; i < n; i++) {
            i = getCount(s, i);
        }
        return res;
    }

    public int getCount(String s, int index) {
        int left = index - 1, right = index, n = s.length();
        while (right < n - 1 && s.charAt(right) == s.charAt(right + 1)) {
            right++;
        }
        int countOfSameChar = right - left;
        if (countOfSameChar >= 1) {
            res += (countOfSameChar * (countOfSameChar + 1)) / 2;
        }
        int nextIndex = right++;
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            res++;
        }
        return nextIndex;
    }
}
