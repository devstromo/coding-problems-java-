package com.devstromo.easy.p2114;

import java.util.StringTokenizer;

class Solution {
    public static int mostWordsFound(String[] sentences) {
        var max = Integer.MIN_VALUE;
        var cont = 0;
        for (var sentence : sentences) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    cont++;
                }
            }
            max = Math.max(max, cont + 1);
            cont = 0;
        }
        return max;
    }

    public static int mostWordsFoundStringTokenizer(String[] sentences) {
        var max = Integer.MIN_VALUE;
        var cont = 0;
        for (var sentence : sentences) {
            var tokenizer = new StringTokenizer(sentence);
            while (tokenizer.hasMoreTokens()) {
                tokenizer.nextToken();
                cont++;
            }
            max = Math.max(max, cont);
            cont = 0;
        }
        return max;
    }
}
