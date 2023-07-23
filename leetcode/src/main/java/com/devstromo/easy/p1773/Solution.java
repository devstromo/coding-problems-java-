package com.devstromo.easy.p1773;

import java.util.List;

class Solution {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        var rule = 0;
        if (ruleKey.equals("color")) {
            rule = 1;
        } else if (ruleKey.equals("name")) {
            rule = 2;
        }
        var result = 0;
        for (var item : items)
            if (item.get(rule).equals(ruleValue))
                result++;
        return result;
    }
}
