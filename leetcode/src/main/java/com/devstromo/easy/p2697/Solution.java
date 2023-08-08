package com.devstromo.easy.p2697;

class Solution {
    public static String makeSmallestPalindrome(String s) {
        var n = s.length();
        var result = new StringBuilder();
        for (var i = 0; i < s.length(); i++) {
            result.append(Character.toString(Math.min(s.charAt(i), s.charAt(n - i - 1))));
        }
        return result.toString();
    }

    public static String makeSmallestPalindromeBest(String s) {
        var arr = s.toCharArray();
        var left = 0;
        var right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                var min = Math.min(arr[left], arr[right]);
                arr[left] = arr[right]= (char) min;
            }
            left++;
            right--;
        }
        return new String(arr);
    }
}
