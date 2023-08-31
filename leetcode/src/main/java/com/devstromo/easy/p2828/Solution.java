package com.devstromo.easy.p2828;

import java.util.List;

class Solution {
    public static boolean isAcronym(List<String> words, String s) {
        var builder = new StringBuilder();
        for (var i = 0; i < words.size(); i++) {
            builder.append(words.get(i)
              .charAt(0));
        }
        return s.equals(builder.toString());
    }
}
