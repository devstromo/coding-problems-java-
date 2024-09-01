package com.devstromo.easy.p2900;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        if (n == 1) {
            return List.of(words[0]);
        }
        final var result = new ArrayList<String>();
        int lastChangedId;
        for (int i = 0; i < n - 1; i++) {
            final var aux = new ArrayList<String>();
            aux.add(words[i]);
            lastChangedId = i;
            for (int j = i + 1; j < n; j++) {
                if (groups[lastChangedId] != groups[j]) {
                    aux.add(words[j]);
                    lastChangedId = j;
                }
            }
            if (result.size() < aux.size()) {
                result.clear();
                result.addAll(aux);
            }
        }
        return result;
    }
}
