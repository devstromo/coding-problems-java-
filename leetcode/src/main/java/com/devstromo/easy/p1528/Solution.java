package com.devstromo.easy.p1528;

class Solution {
    public static String restoreString(String s, int[] indices) {
        var aux = new char[s.length()];
        for (var i = 0; i < s.length(); i++) {
            aux[indices[i]] = s.charAt(i);
        }
        return String.valueOf(aux);
    }
}
