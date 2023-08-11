package com.devstromo.easy.p557;

class Solution {
    public static String reverseWords(String s) {
        var letters = s.toCharArray();
        var left = 0;
        var right = 0;
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                right = i == s.length() - 1 ? i : i - 1;
                while (left <= right) {
                    var temp = letters[left];
                    letters[left] = letters[right];
                    letters[right] = temp;
                    left++;
                    right--;
                }
                left = i + 1;
            }
        }
        return new String(letters);
    }
}
