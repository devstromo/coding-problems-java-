package com.devstromo.easy.p1859;

class Solution {

    public static String sortSentence(String s) {
        var words = new String[9];
        var counter = 0;
        var lastIndex = 0;
        for (var i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                var index = Integer.parseInt(s.charAt(i) + "");
                words[index - 1] = s.substring(lastIndex, i);
                lastIndex = i + 2;
                counter++;
            }
        }
        var builder = new StringBuilder();
        for (var i = 0; i < counter; i++) {
            builder.append(words[i])
              .append(" ");
        }
        return builder.toString()
          .trim();
    }
}
