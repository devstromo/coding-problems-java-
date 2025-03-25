package com.devstromo.medium.p46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    public List<List<Integer>> permuteBest(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int indx = 0;
        getper(nums, indx, ans);
        return ans;
    }

    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    void getper(int[] nums, int indx, List<List<Integer>> ans) {
        ArrayList<Integer> mpp = new ArrayList<>();

        if (indx == nums.length - 1) {
            for (int value : nums) {
                mpp.add(value);
            }
            ans.add(mpp);
            return;
        }

        for (int i = indx; i < nums.length; i++) {
            swap(nums, indx, i);
            getper(nums, indx + 1, ans);
            swap(nums, indx, i);

        }
    }


    private void backtrack(
            int[] nums,
            List<Integer> current,
            boolean[] visited,
            List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            current.add(nums[i]);
            backtrack(nums, current, visited, result);

            visited[i] = false;
            current.removeLast();
        }
    }
}
