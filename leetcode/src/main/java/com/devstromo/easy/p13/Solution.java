package com.devstromo.easy.p13;

import java.util.HashMap;
import java.util.Map;

class Solution {
    static Map<Character, Integer> romanMap = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int romanToInt(String s) {
        var result = 0;
        var prevValue = 0;
        for (var i = s.length() - 1; i >= 0; i--) {
            var c = s.charAt(i);
            var curValue = romanMap.get(c);
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }
        return result;
    }
}
