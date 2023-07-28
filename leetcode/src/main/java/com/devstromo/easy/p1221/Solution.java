package com.devstromo.easy.p1221;

import java.util.Stack;

class Solution {

    public static int balancedStringSplit(String s) {
        var stack = new Stack<Character>();
        var cont = 0;
        for (var i = 0; i < s.length(); i++) {
            balanced(stack, s.charAt(i));
            if (stack.isEmpty()) {
                cont++;
            }
        }
        return cont;
    }

    public static int balancedStringSplitBestMemory(String s) {
        int countR = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                countR++;
            } else {
                countR--;
            }
            if (countR == 0) {
                result++;
            }
        }
        return result;
    }

    private static void balanced(Stack<Character> stack, char letter) {
        if (stack.isEmpty() || stack.peek() == letter) {
            stack.push(letter);
        } else {
            stack.pop();
        }
    }
}
