package com.devstromo.medium.p1871;


import java.util.ArrayDeque;

public class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        final var deque = new ArrayDeque<Integer>();
        int farthest = 0;
        final var n = s.length();
        deque.add(0);

        while (!deque.isEmpty()) {
            final var i = deque.pollFirst();
            var low = Math.max(i + minJump, farthest + 1);
            int high = Math.min(i + maxJump + 1, n);

            for (int j = low; j < high; j++) {
                if (s.charAt(j) == '0') {
                    deque.addLast(j);
                    if (j == n - 1)
                        return true;
                }
            }
            farthest = i + maxJump;
        }
        return false;
    }

    // TLE
    public boolean canReachRecursive(String s, int minJump, int maxJump) {
        int n = s.length();
        if (s.charAt(n - 1) == '1')
            return false;
        boolean[] visited = new boolean[s.length()];
        return canReachRecursive(s, 0, minJump, maxJump, n, visited);
    }

    private boolean canReachRecursive(String s, int idx, int minJump, int maxJump, int n, boolean[] visited) {
        if (idx == n - 1) {
            return true;
        }
        visited[idx] = true;
        int low = idx + minJump;
        int high = Math.min(idx + maxJump, n - 1);
        for (int j = low; j <= high; j++) {
            if (s.charAt(j) == '0' && !visited[j]) {
                if (canReachRecursive(s, j, minJump, maxJump, n, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
