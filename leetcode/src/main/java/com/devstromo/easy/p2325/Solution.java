package com.devstromo.easy.p2325;

import java.util.HashMap;

class Solution {
    public static String decodeMessage(String key, String message) {
        var cipher = new HashMap<Character, Character>();
        cipher.put(' ', ' ');
        var letter = 'a';
        for (var i = 0; i < key.length(); i++) {
            if (!cipher.containsKey(key.charAt(i))) {
                cipher.put(key.charAt(i), letter++);
            }
        }
        var result = new StringBuilder();
        for (var i = 0; i < message.length(); i++) {
            result.append(cipher.get(message.charAt(i)));
        }
        return result.toString();
    }
}
