package com.devstromo.medium.p2266;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int countTexts(String pressedKeys) {
        int n = pressedKeys.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            char currentChar = pressedKeys.charAt(i - 1);
            dp[i] = 0;
            int maxPress = (currentChar == '7' || currentChar == '9') ? 4 : 3;

            for (int j = 1; j <= maxPress && i - j >= 0; j++) {
                if (pressedKeys.charAt(i - j) != currentChar) break;
                dp[i] = (dp[i] + dp[i - j]) % MOD;
            }
        }

        return dp[n];
    }

    int mod = (int) 1e9 + 7;
    int[] typeMap = new int[]{-1, -1, 0, 0, 0, 0, 0, 1, 0, 1};

    public int countTextsBest(String pressedKeys) {
        // left * right
        List<int[]> list = new ArrayList<>();
        int cnt = 0, max = 0;
        char prev = '0';
        for (char c : pressedKeys.toCharArray()) {
            if (prev != c) {
                if (prev != '0') list.add(new int[]{(prev - '0'), cnt});
                max = Math.max(cnt, max);
                cnt = 0;
            }
            cnt++;
            prev = c;
        }
        if (cnt > 0) {
            list.add(new int[]{(prev - '0'), cnt});
            max = Math.max(max, cnt);
        }

        long res = 1;
        Long[][] dp = new Long[2][max + 1];
        dp[0][0] = 1l;
        dp[1][0] = 1l;
        for (int i = 0; i < list.size(); i++) {
            int[] cur = list.get(i);
            int num = cur[0], curCnt = cur[1];
            int type = typeMap[num];

            long combination = helper(type, curCnt, dp);

            res = (res * combination) % mod;
        }

        return (int) res;
    }

    // type 0 = 3 char
    // type 1 = 4 char
    long helper(int type, int cnt, Long[][] dp) {
        if (dp[type][cnt] != null) return dp[type][cnt];

        for (int i = 1; i <= cnt; i++) {
            if (dp[type][i] != null) continue;

            if (i == 1) dp[type][i] = 1l;
            if (i == 2) dp[type][i] = 2l;
            if (i == 3) dp[type][i] = 4l;
            // System.out.println(i + " dp[type][i-1]: "+ dp[type][i-1]);
            if (i >= 4) {
                if (type == 0) dp[type][i] = (dp[type][i - 1] + dp[type][i - 2] + dp[type][i - 3]) % mod;
                else dp[type][i] = (dp[type][i - 1] + dp[type][i - 2] + dp[type][i - 3] + dp[type][i - 4]) % mod;
            }
        }
        return dp[type][cnt];
    }
}
