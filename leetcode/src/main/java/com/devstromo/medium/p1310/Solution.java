package com.devstromo.medium.p1310;

class Solution {

    public static int[] xorQueries(int[] arr, int[][] queries) {
        var result = new int[queries.length];
        var index = 0;
        for (var query : queries) {
            result[index++] = xorQueries(query[0], query[1], arr);
        }
        return result;
    }

    private static int xorQueries(int left, int right, int[] arr) {
        var result = arr[left];
        for (int i = left + 1; i <= right; i++) {
            result ^= arr[i];
        }
        return result;
    }
}
