package com.devstromo.easy.p1678;

import java.util.regex.Pattern;

class Solution {
    private static final Pattern PATTERN = Pattern.compile("(G)|\\(\\)|\\(al\\)");

    public static String interpret(String command) {
        var matcher = PATTERN.matcher(command);
        var builder = new StringBuilder();
        while (matcher.find()) {
            if (matcher.group().equals("G")) {
                builder.append("G");
            } else if (matcher.group().equals("()")) {
                builder.append("o");
            } else {
                builder.append("al");
            }
        }
        return builder.toString();
    }
}
