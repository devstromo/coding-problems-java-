package com.devstromo.easy.p392;

class Solution {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;
        if (t.isEmpty())
            return false;
        int i = 0;
        for (char c : t.toCharArray()) {
            if (c == s.charAt(i)) {
                i++;
                if (i == s.length())
                    return true;
            }
        }
        return false;
    }
}
