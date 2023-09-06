package com.devstromo.easy.p2520;

class Solution {
    public static int countDigits(int num) {
        var digits = String.valueOf(num);
        var count = 0;
        var convert = 0;
        for (var i = 0; i < digits.length(); i++) {
            convert = digits.charAt(i) - '0';
            if (num % convert == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countDigitsOther(int num) {
        var count = 0;
        var temp = num;
        var rem = 0;
        while (temp > 0) {
            rem = temp % 10;
            if (num % rem == 0) {
                count++;
            }
            temp = temp / 10;

        }
        return count;
    }
}
