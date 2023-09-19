package com.devstromo.easy.p1704;

class Solution {
    public static boolean halvesAreAlike(String s) {
        var middle = s.length() / 2;
        var lowerCount = 0;
        var upperCount = 0;
        for (var i = 0; i < middle; i++) {
            if (isVowel(s.charAt(i))) {
                lowerCount++;
            }
            if (isVowel(s.charAt(i + middle))) {
                upperCount++;
            }
        }
        return lowerCount == upperCount;
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}
