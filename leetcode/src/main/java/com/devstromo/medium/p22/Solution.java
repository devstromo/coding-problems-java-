package com.devstromo.medium.p22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        List<List<String>> dp = new ArrayList<>();
        dp.add(Collections.singletonList(""));

        for (int i = 1; i <= n; i++) {
            List<String> currentList = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                for (String left : dp.get(j)) {
                    for (String right : dp.get(i - 1 - j)) {
                        currentList.add("(" + left + ")" + right);
                    }
                }
            }
            dp.add(currentList);
        }

        return dp.get(n);
    }

    public List<String> generateParenthesisBest(int n) {
        res.clear();
        generateP(n, new StringBuilder(), 0, 0);
        return res;
    }

    private void generateP(int n, StringBuilder sb, int open, int close) {
        if (sb.length() == n * 2) {
            res.add(sb.toString());
        }
        if (open < n) {
            sb.append('(');
            generateP(n, sb, open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(')');
            generateP(n, sb, open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
