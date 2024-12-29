package com.devstromo.medium.p2207;

public class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        char first = pattern.charAt(0);
        char second = pattern.charAt(1);

        // Step 1: Count occurrences and existing subsequences
        long count0 = 0; // Count of pattern[0]
        long subsequenceCount = 0; // Count of existing subsequences

        for (char c : text.toCharArray()) {
            if (c == second) {
                subsequenceCount += count0; // Each pattern[0] before this contributes
            }
            if (c == first) {
                count0++; // Increment pattern[0] count
            }
        }

        // Step 2: Simulate inserting pattern[0] at the start or pattern[1] at the end
        long insertFirst = subsequenceCount + count0; // Add pattern[0] at the start
        long insertSecond = subsequenceCount + (text.chars().filter(ch -> ch == second).count()); // Add pattern[1] at the end

        // Step 3: Return the maximum count
        return Math.max(insertFirst, insertSecond);
    }
}
