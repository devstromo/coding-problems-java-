package com.devstromo.hard.p1799;

import java.util.Arrays;

class Solution {

    public static int maxScoreCompact(int[] nums) {
        int n = nums.length;
        int[] dp = new int[1 << n];
        for (int mask = 0; mask < 1 << n; mask++) {
            if (Integer.bitCount(mask) % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) {
                        for (int j = i + 1; j < n; j++) {
                            if ((mask & (1 << j)) != 0) {
                                int nextMask = mask ^ (1 << i) ^ (1 << j);
                                dp[mask] = Math.max(dp[mask], dp[nextMask] + Integer.bitCount(mask) / 2 * gcd(nums[i], nums[j]));
                            }
                        }
                    }
                }
            }
        }
        return dp[(1 << n) - 1];
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int maxScoresSolution(int[] nums) {
        int n = nums.length;

        // Precompute the GCD of all pairs of numbers in the array
        int[][] gcdMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                gcdMatrix[i][j] = gcdMatrix[j][i] = gcd(nums[i], nums[j]);
            }
        }

        // Initialize the dp array
        int[] dp = new int[1 << n];

        // Iterate over all possible subsets of indices
        for (int state = 1; state < (1 << n); state++) {
            // Count the number of indices in the subset
            int cnt = Integer.bitCount(state);

            // If the number of indices is odd, skip this state
            if (cnt % 2 == 1) {
                continue;
            }

            // Calculate the maximum score for this subset of indices
            for (int i = 0; i < n; i++) {
                if ((state & (1 << i)) == 0) {
                    continue;
                }
                for (int j = i + 1; j < n; j++) {
                    if ((state & (1 << j)) == 0) {
                        continue;
                    }
                    int nextState = state ^ (1 << i) ^ (1 << j);
                    dp[state] = Math.max(dp[state], dp[nextState] + cnt / 2 * gcdMatrix[i][j]);
                }
            }
        }

        return dp[(1 << n) - 1];
    }

    public static int maxScoreRecursive(int[] inputNums) {
        int n = inputNums.length / 2;
        int[][] dp = new int[1 << (2 * n)][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve((1 << (2 * n)) - 1, n, dp, inputNums, n);
    }

    private static int solve(int mask, int operations, int[][] dp, int[] nums, int n) {
        if (operations == 0)
            return 0;
        if (dp[mask][operations] != -1)
            return dp[mask][operations];
        int ans = 0;
        for (int i = 0; i < 2 * n; i++) {
            for (int j = i + 1; j < 2 * n; j++) {
                if ((mask & (1 << i)) > 0 && (mask & (1 << j)) > 0) {
                    ans = Math.max(ans, operations * gcd(nums[i], nums[j]) + solve(mask ^ (1 << i) ^ (1 << j), operations - 1, dp, nums, n));
                }
            }
        }
        dp[mask][operations] = ans;
        return ans;
    }

    public static int maxScoreCompactSecond(int[] nums) {
        int n = nums.length;
        int[] dp = new int[1 << n];
        for (int mask = 0; mask < (1 << n); mask++) {
            if (Integer.bitCount(mask) % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) <= 0) {
                        for (int j = i + 1; j < n; j++) {
                            if ((mask & (1 << j)) <= 0) {
                                dp[mask | (1 << i) | (1 << j)] = Math.max(dp[mask | (1 << i) | (1 << j)],
                                  dp[mask] + (Integer.bitCount(mask) / 2 + 1) * gcd(nums[i], nums[j]));
                            }
                        }
                    }
                }
            }
        }
        return dp[(1 << n) - 1];
    }

    public static int maxScoreBestRuntime(int[] nums) {
        int n = nums.length;
        int[][] gcd = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                gcd[i][j] = gcd(nums[i], nums[j]);
            }
        }
        int[] dp = new int[1 << n];
        for (int i = 0; i < (1 << n); i++) {
            int cnt = Integer.bitCount(i);
            if (cnt % 2 != 0)
                continue;
            for (int x = 0; x < n; x++) {
                if ((i & (1 << x)) > 0)
                    continue;
                for (int y = x + 1; y < n; y++) {
                    if ((i & (1 << y)) > 0)
                        continue;
                    dp[i | (1 << x) | (1 << y)] = Math.max(dp[i] + gcd[x][y] * (cnt / 2 + 1), dp[i | (1 << x) | (1 << y)]);
                }
            }
        }
        return dp[(1 << n) - 1];
    }
}
