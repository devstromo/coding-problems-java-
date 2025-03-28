package com.devstromo.hard.p2565;

class Solution {
    public int minimumScore(String s, String t) {
        int m = s.length();
        int n = t.length();

        // left[i] is the maximum index in s that matches t[0..i-1]
        int[] left = new int[n];
        // right[i] is the minimum index in s that matches t[i..n-1]
        int[] right = new int[n];

        // Preprocess left array
        for (int i = 0, j = 0; i < n; i++) {
            while (j < m && s.charAt(j) != t.charAt(i)) {
                j++;
            }
            if (j < m) {
                left[i] = j;
                j++;
            } else {
                left[i] = -1; // indicates no match
            }
        }

        // Preprocess right array
        for (int i = n - 1, j = m - 1; i >= 0; i--) {
            while (j >= 0 && s.charAt(j) != t.charAt(i)) {
                j--;
            }
            if (j >= 0) {
                right[i] = j;
                j--;
            } else {
                right[i] = -1; // indicates no match
            }
        }

        // The minimal score is the minimal (r - l + 1) where left[l-1] < right[r+1]
        // Also, the entire t is a subsequence of s if left[n-1] != -1, then score 0

        if (left[n - 1] != -1) {
            return 0;
        }

        int minScore = n; // worst case: remove all characters

        // Check for cases where the suffix is enough (l = 0)
        for (int r = 0; r < n; r++) {
            if (right[r] != -1) {
                minScore = Math.min(minScore, r); // since l is 0, window is [0..r-1], but r is the first not removed?
                // Wait, if right[r] is valid, then t[r..n-1] is a subsequence of s. So removed part is 0..r-1.
                // So the score is (r-1 - 0 + 1) = r.
                // So minScore is r.
                // So we can break here since r increases, but we need the minimal.
                // But since r is increasing, the first r is the smallest.
                break;
            }
        }

        // Check for cases where the prefix is enough (r = n-1)
        for (int l = n - 1; l >= 0; l--) {
            if (left[l] != -1) {
                minScore = Math.min(minScore, n - 1 - l);
                break;
            }
        }

        // Now check for cases where left[l] and right[r] are valid and l + 1 <= r -1.
        // We need to find l and r such that left[l] < right[r], then the window is l+1 to r-1, size (r-1 - (l+1) + 1) = r - l - 1.
        // So for each l where left[l] != -1, find the smallest r > l such that right[r] > left[l].

        for (int l = 0; l < n; l++) {
            if (left[l] == -1) continue;
            int r = findMinR(right, left[l], l + 1);
            if (r != -1) {
                int currentScore = r - l - 1;
                minScore = Math.min(minScore, currentScore);
            }
        }

        return minScore;
    }

    private int findMinR(int[] right, int leftPos, int start) {
        int left = start;
        int rightBound = right.length - 1;
        int result = -1;

        while (left <= rightBound) {
            int mid = left + (rightBound - left) / 2;
            if (right[mid] > leftPos) {
                result = mid;
                rightBound = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}