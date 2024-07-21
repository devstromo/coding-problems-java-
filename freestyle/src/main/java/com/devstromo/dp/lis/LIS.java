package com.devstromo.dp.lis;

import java.util.*;
import java.util.stream.Collectors;

class LIS {

    public static int lis(int[] nums) {
        var n = nums.length;
        var lis = new int[n];
        var i = 0;
        var j = 0;
        var max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }

        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (nums[j] < nums[i] && lis[j] + 1 > lis[i])
                    lis[i] = lis[j] + 1;
            }
        }
        for (i = 0; i < n; i++) {
            if (max < lis[i])
                max = lis[i];
        }

        return max;
    }

    public static int lisP1(int[] nums) {
        var n = nums.length;
        var lis = new int[n];
        var max = Integer.MIN_VALUE;
        for (var i = 0; i < n; i++) {
            lis[i] = 1;
        }
        for (var i = 1; i < n; i++) {
            for (var j = 0; j < i; j++) {
                if (nums[j] < nums[i] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        for (var i = 0; i < n; i++) {
            if (lis[i] > max)
                max = lis[i];
        }
        return max;
    }

    public static int lisP2(int[] nums) {
        var n = nums.length;
        var lis = new int[n];
        var i = 0;
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }
        var max = Integer.MIN_VALUE;
        for (i = 1; i < n; i++) {
            for (var j = 0; j < i; j++) {
                if (nums[i] > nums[j] && Math.abs(nums[i] - nums[j]) >= 2 && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
            max = Math.max(max, lis[i]);
        }
        return max;
    }

    public static int lisP3(int[] nums) {
        return lisWithBS(Arrays.stream(nums).boxed().toList());
    }

    public static int lisWithBS(List<Integer> arr) {
        var n = arr.size();
        var tails = new int[n];
        var size = 0;
        var i = 0;
        var j = size;
        for (var k = 0; k < n; k++) {
            i = 0;
            j = size;
            // binary search variations
            while (i != j) {
                var mid = (i + j) / 2;
                if (tails[mid] < arr.get(k))
                    i = mid + 1;
                else
                    j = mid;
            }
            tails[i] = arr.get(k);
            if (i == size)
                ++size;
        }
        return size;
    }

    public static int longestDecreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] lds = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            lds[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i] && lds[j] + 1 > lds[i]) {
                    lds[i] = lds[j] + 1;
                }
            }
            max = Math.max(max, lds[i]);
        }

        return max;
    }

    public static int longestBitonicSubsequence(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n]; // Longest Increasing Subsequence lengths
        int[] lds = new int[n]; // Longest Decreasing Subsequence lengths
        Arrays.fill(lis, 1);
        Arrays.fill(lds, 1);

        // Calculate LIS for each element as ending point
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // Calculate LDS for each element as starting point
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[i] > nums[j] && lds[j] + 1 > lds[i]) {
                    lds[i] = lds[j] + 1;
                }
            }
        }

        // Find the maximum length of Bitonic Subsequence
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            maxLength = Math.max(maxLength, lis[i] + lds[i] - 1);
        }

        return maxLength;
    }

    public static int longestIncreaseSubsequenceWithUniqueDifference(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // DP array where dp[i] stores a map.
        // The map keys are differences with the previous element in the subsequence,
        // and the values are the lengths of the longest subsequence ending at i with that difference.
        Map<Integer, Integer>[] dp = new HashMap[nums.length];

        int maxLength = 1; // At least each individual number can form a subsequence.

        for (int i = 0; i < nums.length; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                // The length of the longest subsequence ending at j with a difference 'diff'.
                // If dp[j] does not contain diff, we consider it as a new subsequence starting from j to i.
                int length = dp[j].getOrDefault(diff, 1) + 1;

                // Update the maxLength if necessary.
                maxLength = Math.max(maxLength, length);

                // Update dp[i] with the longest subsequence ending at i with difference 'diff'.
                // Ensures no two adjacent elements have the same difference in the subsequence.
                dp[i].put(diff, Math.max(dp[i].getOrDefault(diff, 0), length));
            }
        }

        return maxLength;
    }

    // Time: O(N^2)
    // Space: O(N)
    public static int longestIncreaseSubsequenceWithDifferenceOfOne(int[] nums) {
        final var n = nums.length;
        final var dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((nums[i] == nums[j] + 1) || (nums[i] == nums[j] - 1))
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        var result = 1;
        for (int i = 0; i < n; i++)
            if (result < dp[i])
                result = dp[i];
        return result;
    }

    // Time: O(N)
    // Space: O(N)
    public static int longestIncreaseSubsequenceWithDifferenceOfOneOptimized(int[] nums) {
        final var n = nums.length;
        if (n == 1)
            return 1;
        final var dp = new Integer[n];
        final var memo = new HashMap<Integer, Integer>();
        dp[0] = 1;
        memo.put(nums[0], 0);
        for (int i = 1; i < n; i++) {
            if (Math.abs(nums[i] - nums[i - 1]) == 1)
                dp[i] = dp[i - 1] + 1;
            else {
                if (memo.containsKey(nums[i] + 1)
                        || memo.containsKey(nums[i] - 1)) {
                    dp[i] = 1
                            + Math.max(memo.getOrDefault(
                                    nums[i] + 1, 0),
                            memo.getOrDefault(
                                    nums[i] - 1, 0));
                } else
                    dp[i] = 1;
            }
            memo.put(nums[i], dp[i]);
        }
        var max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}
