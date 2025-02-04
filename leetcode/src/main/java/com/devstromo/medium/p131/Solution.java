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

    public List<List<String>> partitionBest(String s) {

        return new java.util.AbstractList<List<String>>() {
            List<List<String>> result;

            public int size() {
                if (result == null) {
                    init();
                }
                return result.size();
            }

            public List<String> get(int index) {
                return result.get(index);
            }

            public void init() {
                result = new ArrayList<>();
                recursive(result, new ArrayList<>(), s, 0);
            }
        };
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

    private void recursive(List<List<String>> result, List<String> list, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            String str = s.substring(start, i + 1);
            if (isPalindrome(str)) {
                list.add(str.toString());
                recursive(result, list, s, i + 1);
                list.removeLast();
            }
        }
    }

    private boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

