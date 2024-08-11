package com.devstromo.medium.p1871;


public class Solution {
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
