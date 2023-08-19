package com.devstromo.easy.p2744;

class Solution {
    public static int maximumNumberOfStringPairs(String[] words) {
        var counter = 0;
        for (var i = 0; i < words.length - 1; i++) {
            for (var j = i + 1; j < words.length; j++) {
                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
