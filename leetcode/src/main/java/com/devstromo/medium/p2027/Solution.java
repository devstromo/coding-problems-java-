package com.devstromo.medium.p2027;

import java.util.*;

public class Solution {
    private TrieNode root;
    private Integer[] memo;

    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Set<String> dictSet = new HashSet<>(Arrays.asList(dictionary));

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 1; j <= i; j++) {
                if (dictSet.contains(s.substring(j - 1, i))) {
                    dp[i] = Math.min(dp[i], dp[j - 1]);
                }
            }
        }
        return dp[n];
    }

    public int minExtraCharTrie(String s, String[] dictionary) {
        root = new TrieNode();
        memo = new Integer[s.length()];

        for (String word : dictionary) {
            insertIntoTrie(word);
        }

        return dfs(s, 0);
    }

    private void insertIntoTrie(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEnd = true; // Mark the end of a valid dictionary word
    }

    private int dfs(String s, int i) {
        if (i >= s.length()) return 0;
        if (memo[i] != null) return memo[i];

        int minExtra = 1 + dfs(s, i + 1); // Assume s[i] is extra

        TrieNode node = root;
        for (int j = i; j < s.length(); j++) {
            char c = s.charAt(j);
            if (!node.children.containsKey(c)) break;
            node = node.children.get(c);
            if (node.isEnd) {
                minExtra = Math.min(minExtra, dfs(s, j + 1));
            }
        }

        return memo[i] = minExtra;
    }

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd;
    }
}
