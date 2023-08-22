package com.devstromo.easy.p1844;

class Solution {
    public static String replaceDigits(String s) {
        var letters = s.toCharArray();
        for (var i = 1; i < letters.length; i += 2) {
            letters[i] = (char) (letters[i - 1] + Character.getNumericValue(letters[i]));
        }
        return new String(letters);
    }
}
