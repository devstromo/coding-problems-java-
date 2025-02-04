package com.devstromo.medium.p131;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        boolean[][] isPalindrome = precomputePalindromes(s);
        backtrack(s, 0, new ArrayList<>(), result, isPalindrome);
        return result;
    }

    private void backtrack(String s, int start, List<String> path, List<List<String>> result, boolean[][] isPalindrome) {
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome[start][end]) {
                path.add(s.substring(start, end + 1));  // Add the current palindrome substring
                backtrack(s, end + 1, path, result, isPalindrome); // Recur for remaining substring
                path.removeLast();  // Backtrack and remove last added substring
            }
        }
    }

    private boolean[][] precomputePalindromes(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];

        for (int right = 0; right < n; right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || isPalindrome[left + 1][right - 1])) {
                    isPalindrome[left][right] = true;
                }
            }
        }
        return isPalindrome;
    }
}

