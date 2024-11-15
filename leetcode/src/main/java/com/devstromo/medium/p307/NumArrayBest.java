package com.devstromo.medium.p307;

public class NumArrayBest {
    private int len;
    private int[] n;

    // binary indexed tree
    private int[] tree;

    public NumArrayBest(int[] nums) {
        len = nums.length;
        n = new int[len];

        // solution: binary index tree
        // O(nlogn) time
        tree = new int[len + 1];

        for (int i = 0; i < len; i++) {
            update(i, nums[i]);
        }
    }

    public void update(int index, int val) {
        int diff = val - n[index];
        n[index] = val;
        // solution: binary index tree
        // O(logn) time
        for (int i = index + 1; i <= len; i = i + lowbit(i)) {
            tree[i] += diff;
        }
    }

    public int sumRange(int left, int right) {
        // solution: binary index tree
        // O(logn) time
        return getPresum(right + 1) - getPresum(left);
    }

    private int getPresum(int index) {
        int s = 0;

        for (int i = index; i > 0; i = i - lowbit(i)) {
            s += tree[i];
        }

        return s;
    }

    private int lowbit(int i) {
        return i & (-i);
    }
}
