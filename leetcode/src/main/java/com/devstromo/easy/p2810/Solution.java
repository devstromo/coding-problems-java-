package com.devstromo.easy.p2810;

class Solution {
    public static String finalString(String s) {
        var builder = new StringBuilder();
        var cont = 0;
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                builder = new StringBuilder(reverseSubstring(builder.toString(), 0, cont));
            } else {
                builder.append(s.charAt(i));
                cont++;
            }
        }
        return builder.toString();
    }

    public static String finalStringBest(String s) {
        var ans = new StringBuilder();
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                ans.reverse();
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    public static String reverseSubstring(String s, int start, int end) {
        var characters = s.toCharArray();
        var left = start;
        var right = end - 1;
        while (left < right) {
            var temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return new String(characters);
    }

}
