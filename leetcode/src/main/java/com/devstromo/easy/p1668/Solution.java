package com.devstromo.easy.p1668;

public class Solution {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        if (n < m) return 0;
        if (n == m) return sequence.equals(word) ? 1 : 0;
        int count = 0;
        while (sequence.contains(word.repeat(count))) {
            count++;
        }

        return count - 1;
    }

    public int maxRepeatingBest(String sequence, String word) {
        if (!sequence.contains(word)) return 0;
        int repeating = 0;
        String now=  word;
        while (sequence.contains(now)) {
            repeating++;
            now+=word;
        }
        return repeating;
    }

}
