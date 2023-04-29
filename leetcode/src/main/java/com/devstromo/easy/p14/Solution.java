package com.devstromo.easy.p14;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] inputs) {
        if (inputs == null || inputs.length == 0) {
            return "";
        }
        var prefix = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            while (!inputs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public String longestCommonPrefixFromSite(String[] strs) {
        Arrays.sort(strs);
        var s1 = strs[0];
        var s2 = strs[strs.length - 1];
        var idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
