package com.devstromo.medium.p1306;

class Solution {

    public boolean canReachRecursive(int[] arr, int start) {
        final var visited = new boolean[arr.length];
        return canReachRecursive(arr, start, visited);
    }

    private boolean canReachRecursive(int[] arr, int idx, boolean[] visited) {
        if (idx < 0 || idx >= arr.length || visited[idx]) {
            return false;
        }
        if (arr[idx] == 0) {
            return true;
        }
        visited[idx] = true;
        int idxLeft = idx - arr[idx];
        int idxRight = idx + arr[idx];
        return canReachRecursive(arr, idxLeft, visited) || canReachRecursive(arr, idxRight, visited);
    }
}
