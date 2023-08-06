package com.devstromo.easy.p804;

import java.util.HashSet;

class Solution {
    static String[] dictionary = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
      "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

    public static int uniqueMorseRepresentations(String[] words) {
        var transforms = new HashSet<String>();
        for (var word : words) {
            transforms.add(transform(word));
        }
        return transforms.size();
    }

    private static String transform(String word) {
        var builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            builder.append(dictionary[word.charAt(i) - 'a']);
        }
        return builder.toString();
    }
}
