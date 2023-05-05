package com.devstromo.easy.p58;

class Solution {
    public static int lengthOfLastWord(String s) {
        var parsed = s.trim()
          .split(" ");
        return parsed[parsed.length - 1].length();
    }

    public static int lengthOfLastWordNotBuildIn(String s) {
        var index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }
        var count = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            count++;
            index--;
        }
        return count;
    }
}
