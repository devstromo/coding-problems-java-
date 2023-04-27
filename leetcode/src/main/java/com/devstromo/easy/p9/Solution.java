package com.devstromo.easy.p9;

import java.util.Stack;

class Solution {
    public static boolean isPalindrome(int x) {
        var number = Integer.toString(x);
        var n = number.length();
        for (var i = 0; i < n / 2; i++) {
            if (number.charAt(i) != number.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
