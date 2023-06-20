package com.devstromo.kyu6.ConsecutiveStrings;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k < 1 || strarr.length < k) {
            return "";
        }
        var result = "";
        var n = strarr.length;
        for (int i = 0; i <= n - k; i++) {
            StringBuilder aux = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                aux.append(strarr[j]);
            }
            if (result.length() < aux.length())
                result = aux.toString();
        }
        return result;
    }
}
