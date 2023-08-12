package com.devstromo.easy.p1614;

import java.util.Stack;

class Solution {
    public static int maxDepth(String s) {
        if (s.length() < 2)
            return 0;
        var stack = new Stack<Character>();
        var maxDepth = 0;
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else if (s.charAt(i) == ')' && stack.peek() == '(') {
                maxDepth = Math.max(maxDepth, stack.size());
                stack.pop();
            }
        }
        return maxDepth;
    }

    public static int maxDepthBest(String s) {
        if (s.length() < 2)
            return 0;
        var maxDepth = 0;
        var count = 0;
        for (var i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                count++;
            if (ch == ')')
                count--;
            maxDepth = Math.max(count, maxDepth);
        }
        return maxDepth;
    }
}
