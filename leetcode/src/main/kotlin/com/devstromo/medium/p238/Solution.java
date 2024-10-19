package com.devstromo.medium.p238;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }

    public int[] productExceptSelfSpaceOptimized(int[] nums) {
        int n = nums.length;
        int[] answers = new int[n];
        Arrays.fill(answers, 1);
        int current = 1;
        for(int i = 0; i < n; i++) {
            answers[i] *= current;
            current *= nums[i];
        }
        current = 1;
        for(int i = n - 1; i >= 0; i--) {
            answers[i] *= current;
            current *= nums[i];
        }
        return answers;
    }
}
