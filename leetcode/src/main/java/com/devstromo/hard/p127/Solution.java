package com.devstromo.hard.p127;

import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of words at current level
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] wordArray = word.toCharArray();

                for (int j = 0; j < wordArray.length; j++) {
                    char originalChar = wordArray[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue; // Skip if it's the same character

                        wordArray[j] = c;
                        String newWord = new String(wordArray);

                        if (newWord.equals(endWord)) return level + 1; // Found shortest path
                        if (wordSet.contains(newWord)) {
                            queue.add(newWord);
                            wordSet.remove(newWord); // Remove to avoid revisiting
                        }
                    }
                    wordArray[j] = originalChar; // Restore original character
                }
            }
            level++;
        }

        return 0;
    }
}
