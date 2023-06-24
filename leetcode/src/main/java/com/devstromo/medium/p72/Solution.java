package com.devstromo.medium.p72;

class Solution {

    public static int minDistance(String word1, String word2) {
        var m = word1.length();
        var n = word2.length();
        var edit = new int[m + 1][n + 1];
        for (var i = 0; i <= m; i++) {
            edit[i][0] = i;
        }
        for (var i = 0; i <= n; i++) {
            edit[0][i] = i;
        }
        for (var i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    edit[i][j] = edit[i - 1][j - 1];
                } else {
                    edit[i][j] = min(edit[i - 1][j - 1], edit[i][j - 1], edit[i - 1][j]) + 1;
                }
            }
        }
        return edit[m][n];
    }

    public static int minDistanceRecursivo(String word1, String word2) {
        if (word1 == null || word1.isEmpty())
            return word2.length();

        if (word2 == null || word2.isEmpty())
            return word1.length();

        // are the same characters
        if (word1.charAt(0) == word2.charAt(0)) {
            return minDistanceRecursivo(word1.substring(1), word2.substring(1));
        }
        // Find edit distance for all three operations
        var d = minDistanceRecursivo(word1.substring(1), word2);
        var u = minDistanceRecursivo(word1.substring(1), word2.substring(1));
        var i = minDistanceRecursivo(word1, word2.substring(1));
        // Return minimum of the three values plus 1
        return min(d, u, i) + 1;
    }

    private static int min(int value1, int value2, int value3) {
        return Math.min(Math.min(value1, value2), value3);
    }
}
