package com.devstromo.easy.p2194;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> cellsInRange(String s) {
        var firstLetter = s.charAt(0);
        var lastLetter = s.charAt(3);
        var firstNumber = s.charAt(1);
        var lastNumber = s.charAt(4);
        var result = new ArrayList<String>();
        while (firstLetter <= lastLetter) {
            for (var i = firstNumber; i <= lastNumber; i++) {
                result.add(new String(new char[]{firstLetter, i}));
            }
            firstLetter++;
        }
        return result;
    }
}
