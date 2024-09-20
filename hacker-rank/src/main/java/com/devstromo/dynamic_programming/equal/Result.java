package com.devstromo.dynamic_programming.equal;

import java.util.Collections;
import java.util.List;

public class Result {

    public static int equal(List<Integer> arr) {
        int min = Collections.min(arr);
        int result = Integer.MAX_VALUE;

        for (int base = min; base >= min - 4; base--) {
            int currentOperations = 0;
            for (int value : arr) {
                int delta = value - base;
                currentOperations += delta / 5;
                delta %= 5;
                currentOperations += delta / 2;
                delta %= 2;
                currentOperations += delta;
            }
            result = Math.min(result, currentOperations);
        }
        return result;
    }
}
