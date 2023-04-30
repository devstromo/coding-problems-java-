package com.devstromo.easy.p20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for (var i = 0; i < s.length(); i++) {
            if (isOpenParentheses(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (isClosedParentheses(s.charAt(i))) {
                if (stack.isEmpty() || !matchParentheses(stack.pop(), s.charAt(i))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpenParentheses(Character open) {
        return open == '(' || open == '{' || open == '[';
    }

    private boolean isClosedParentheses(Character closed) {
        return closed == ')' || closed == '}' || closed == ']';
    }

    private boolean matchParentheses(Character openParentheses, Character closedParentheses) {
        return switch (openParentheses) {
            case '(' -> closedParentheses == ')';
            case '{' -> closedParentheses == '}';
            case '[' -> closedParentheses == ']';
            default -> false;
        };
    }
}
