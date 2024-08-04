package com.devstromo.medium.p1306;

import java.util.HashSet;
import java.util.LinkedList;

class Solution {
    public boolean canReach(int[] arr, int start) {
        final var queue = new LinkedList<Integer>();
        queue.add(start);
        final var visited = new HashSet<Integer>();

        while (!queue.isEmpty()) {
            final var current = queue.poll();

            if (arr[current] == 0) {
                return true;
            }
            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);

            int idxLeft = current - arr[current];
            int idxRight = current + arr[current];

            if (idxLeft >= 0 && !visited.contains(idxLeft)) {
                queue.add(idxLeft);
            }
            if (idxRight < arr.length && !visited.contains(idxRight)) {
                queue.add(idxRight);
            }
        }

        return false;
    }

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
