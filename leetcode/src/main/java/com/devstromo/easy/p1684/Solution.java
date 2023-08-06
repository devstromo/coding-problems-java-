package com.devstromo.easy.p1684;

class Solution {
    public static int countConsistentStrings(String allowed, String[] words) {
        var count = 0;
        var flag = true;
        for (var word : words) {
            for (var i = 0; i < word.length(); i++) {
                if (!allowed.contains(word.charAt(i) + "")) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
            flag = true;
        }
        return count;
    }

    public static int countConsistentStringsBestMemory(String allowed, String[] words) {
        var count = 0;
        var dict = new int[26];
        for (var i = 0; i < allowed.length(); i++) {
            dict[allowed.charAt(i) - 'a'] = 1;
        }
        for (var word : words) {
            count++;
            for (var i = 0; i < word.length(); i++) {
                if (dict[word.charAt(i) - 'a'] != 1) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
