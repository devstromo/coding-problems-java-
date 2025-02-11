package com.devstromo.hard.p140;

import java.util.*;

public class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        return backtrack(s, new HashSet<>(wordDict), new HashMap<>());
    }

    private List<String> backtrack(String s, Set<String> wordDict, Map<String, List<String>> memo) {
        // If already computed, return cached result
        if (memo.containsKey(s)) return memo.get(s);

        List<String> result = new ArrayList<>();

        // If `s` itself is a word, add it as a valid sentence
        if (wordDict.contains(s)) {
            result.add(s);
        }

        // Try breaking the string into prefix and suffix
        for (int i = 1; i < s.length(); i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(i);

            if (wordDict.contains(prefix)) {
                List<String> subSentences = backtrack(suffix, wordDict, memo);
                for (String sub : subSentences) {
                    result.add(prefix + " " + sub);
                }
            }
        }

        // Cache the result
        memo.put(s, result);
        return result;
    }

    public List<String> wordBreakBest(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        List<String> results = new ArrayList<>();
        backtrackBest(s, wordSet, new StringBuilder(), results, 0);
        return results;
    }

    private void backtrackBest(String s, Set<String> wordSet, StringBuilder currentSentence, List<String> results, int startIndex) {
        if (startIndex == s.length()) {
            results.add(currentSentence.toString().trim());
            return;
        }
        for (
                int endIndex = startIndex + 1;
                endIndex <= s.length();
                endIndex++
        ) {
            String word = s.substring(startIndex, endIndex);
            if (wordSet.contains(word)) {
                int currentLength = currentSentence.length();
                currentSentence.append(word).append(" ");
                backtrackBest(s, wordSet, currentSentence, results, endIndex);
                currentSentence.setLength(currentLength);
            }
        }
    }
}
