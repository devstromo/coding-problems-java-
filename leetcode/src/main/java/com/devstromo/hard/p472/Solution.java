package com.devstromo.hard.p472;

import java.util.*;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        // Sort the words by length to ensure shorter words are processed first
        Arrays.sort(words, Comparator.comparingInt(String::length));

        // HashSet to store all the words that have been processed so far
        Set<String> wordSet = new HashSet<>();

        // List to store the result
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (canForm(word, wordSet)) {
                result.add(word);
            }
            wordSet.add(word);
        }

        return result;
    }

    private boolean canForm(String word, Set<String> wordSet) {
        if (wordSet.isEmpty()) return false;

        int n = word.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Empty string is always true

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (!dp[j]) continue; // If dp[j] is false, skip

                String substring = word.substring(j, i);
                if (wordSet.contains(substring)) {
                    dp[i] = true;
                    break; // No need to check further for this i
                }
            }
        }

        return dp[n];
    }
}
