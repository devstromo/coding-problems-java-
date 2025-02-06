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


    public List<String> findAllConcatenatedWordsInADictBest(String[] words) {
        return new AbstractList<String>() {
            private List<String> res;

            private void init() {
                if (res == null) res = process(words);
            }

            @Override
            public int size() {
                init();
                return res.size();
            }

            @Override
            public String get(int index) {
                init();
                return res.get(index);
            }
        };
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

    private boolean wordBreak(Trie trie, String s) {
        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            if (i == 0 || dp[i - 1]) {
                Node curr = null;
                for (int j = i; j < s.length(); ++j) {
                    char c = s.charAt(j);
                    curr = trie.traverse(c, curr);
                    if (curr == null) break;
                    if (curr.isWord) dp[j] = true;
                }
            }
        }
        return dp[s.length() - 1];
    }

    private List<String> process(String[] words) {
        List<String> res = new ArrayList<>();
        Trie trie = new Trie();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        trie.insert(words[0]);
        for (int i = 1; i < words.length; ++i) {
            if (wordBreak(trie, words[i])) res.add(words[i]);
            trie.insert(words[i]);
        }
        return res;
    }

    static class Trie {
        private final Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String s) {
            Node curr = root;
            for (int i = 0; i < s.length(); ++i) {
                char c = s.charAt(i);
                Node child = curr.childs.getOrDefault(c, new Node());
                curr.childs.put(c, child);
                curr = child;
            }
            curr.isWord = true;
        }

        public Node traverse(char c, Node r) {
            if (r == null) r = root;
            return r.childs.getOrDefault(c, null);
        }
    }

    static class Node {
        public Map<Character, Node> childs;
        public boolean isWord;

        public Node() {
            childs = new HashMap<>();
        }
    }

}
