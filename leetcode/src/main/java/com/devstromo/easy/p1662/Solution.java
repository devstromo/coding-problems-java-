package com.devstromo.easy.p1662;

class Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var first = String.join("", word1);
        var second = String.join("", word2);
        var index = 0;
        while (index < first.length() && index < second.length()) {
            if (first.charAt(index) != second.charAt(index))
                return false;
            index++;
        }
        return index == first.length() && index == second.length();
    }
}
