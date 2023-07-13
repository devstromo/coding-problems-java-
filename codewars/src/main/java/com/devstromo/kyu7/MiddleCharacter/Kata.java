package com.devstromo.kyu7.MiddleCharacter;

class Kata {
    public static String getMiddle(String word) {
        var n = word.length();
        return n % 2 == 0 ? word.charAt(n / 2 - 1) + "" + word.charAt(n / 2) : word.charAt(n / 2) + "";
    }
}
