package com.devstromo.easy.p1832;

import java.util.HashSet;

class Solution {
    public static boolean checkIfPangram(String sentence) {
        var alphabet = new HashSet<Character>();
        for (var i = 0; i < sentence.length(); i++) {
            var letter = sentence.charAt(i);
            if (Character.isAlphabetic(letter)) {
                alphabet.add(letter);
            }
        }
        return alphabet.size() == 26;
    }
}
