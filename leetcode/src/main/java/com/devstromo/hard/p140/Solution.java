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
}
