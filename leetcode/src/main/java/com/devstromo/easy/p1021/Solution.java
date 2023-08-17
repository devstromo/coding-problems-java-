package com.devstromo.easy.p1021;

class Solution {
    public static String removeOuterParentheses(String s) {
        var builder = new StringBuilder();
        var count = 0;
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && count++ > 0)
                builder.append(s.charAt(i));
            if (s.charAt(i) == ')' && count-- > 1)
                builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
