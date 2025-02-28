package com.devstromo.medium.p241;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private final Map<String, List<Integer>> memo = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        if (memo.containsKey(expression)) {
            return memo.get(expression);
        }

        List<Integer> result = new ArrayList<>();
        boolean isNumber = true;

        // Iterate over the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                isNumber = false;

                // Split at operator into left and right sub-expressions
                List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1));

                // Compute all possible results
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        result.add(compute(left, right, c));
                    }
                }
            }
        }

        // If no operator was found, treat the string as a number
        if (isNumber) {
            result.add(Integer.parseInt(expression));
        }

        memo.put(expression, result);
        return result;
    }

    private int compute(int left, int right, char operator) {
        return switch (operator) {
            case '+' -> left + right;
            case '-' -> left - right;
            case '*' -> left * right;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
